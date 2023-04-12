package fr.simplon.festivals;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import fr.simplon.festivals.dao.impl.FestivalRepository;
import fr.simplon.festivals.entity.Festival;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * La classe DataLoader implémente l'interface ApplicationRunner de Spring Boot pour charger les données de festivals depuis un fichier JSON dans la base de données lors du démarrage de l'application.
 */
@Component
public class DataLoader implements ApplicationRunner
{
    /**
     * Le référentiel FestivalRepository est injecté dans le constructeur pour pouvoir effectuer des opérations de base de données.
     */
    private final FestivalRepository FestivalRepository;

    /**
     * Constructeur de DataLoader qui permet d'injecter le référentiel FestivalRepository.
     * @param festivalRepository Le référentiel FestivalRepository à injecter.
     */
    @Autowired
    public DataLoader(FestivalRepository festivalRepository)
    {
        this.FestivalRepository = festivalRepository;
    }

    /**
     * Cette méthode charge les données de festivals depuis un fichier JSON dans la base de données lors du démarrage de l'application, si la base de données est vide.
     * @param args Les arguments de l'application.
     * @throws Exception Si une erreur survient lors de la lecture du fichier JSON ou de l'enregistrement des festivals dans la base de données.
     */
    @Override
    public void run(ApplicationArguments args) throws Exception
    {
        if (FestivalRepository.count() == 0)
        {
            ClassPathResource resource = new ClassPathResource("static/festivals.json");

            ObjectMapper objectMapper = new ObjectMapper();
            List<Festival> festivals = objectMapper.readValue(
                    resource.getInputStream(), new TypeReference<List<Festival>>(){});
            FestivalRepository.saveAll(festivals);
        }
    }
}