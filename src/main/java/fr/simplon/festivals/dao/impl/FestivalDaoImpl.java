package fr.simplon.festivals.dao.impl;

import fr.simplon.festivals.dao.FestivalDao;
import fr.simplon.festivals.entity.Festival;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

/**
 * Cette classe implémente l'interface FestivalDao pour fournir des méthodes permettant de manipuler des objets Festival dans la base de données.
 */
@Repository
public class FestivalDaoImpl implements FestivalDao {


    /**
     * Constructeur par défaut de la classe FestivalDaoImpl.
     */
    public FestivalDaoImpl() {
        // TODO: Ajouter une implémentation si nécessaire.
    }

    /**
     * Repository Spring pour les objets Festival.
     */
    @Autowired
    private FestivalRepository festivalRepository;

    /**
     * Enregistre un objet Festival dans la base de données.
     *
     * @param festival l'objet Festival à enregistrer
     * @return l'objet Festival enregistré
     */
    @Override
    public Festival save(Festival festival) {
        return festivalRepository.save(festival);
    }

    /**
     * Enregistre une liste d'objets Festival dans la base de données.
     *
     * @param festivals la liste d'objets Festival à enregistrer
     * @return la liste des objets Festival enregistrés
     */
    @Override
    public List<Festival> saveAll(List<Festival> festivals) {
        return festivalRepository.saveAll(festivals);
    }

    /**
     * Récupère tous les objets Festival de la base de données.
     *
     * @return la liste des objets Festival de la base de données
     */
    @Override
    public List<Festival> showAllFestivals(){
        return festivalRepository.findAll();
    }

    /**
     * Récupère un objet Festival à partir de son identifiant.
     *
     * @param id l'identifiant de l'objet Festival à récupérer
     * @return l'objet Festival correspondant à l'identifiant sous forme optionnelle
     */
    @Override
    public Optional<Festival> findById(Long id) {
        return festivalRepository.findById(id);
    }
}

