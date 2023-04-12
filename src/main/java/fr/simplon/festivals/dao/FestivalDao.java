package fr.simplon.festivals.dao;

import fr.simplon.festivals.entity.Festival;

import java.util.List;
import java.util.Optional;

/**
 * Cette interface définit les méthodes pour manipuler des objets Festival dans la base de données.
 */
public interface FestivalDao {

    /**
     * Enregistre un objet Festival dans la base de données.
     *
     * @param festival l'objet Festival à enregistrer
     * @return l'objet Festival enregistré
     */
    Festival save(Festival festival);

    /**
     * Enregistre une liste d'objets Festival dans la base de données.
     *
     * @param festivals la liste d'objets Festival à enregistrer
     * @return la liste des objets Festival enregistrés
     */
    List<Festival> saveAll(List<Festival> festivals);

    /**
     * Récupère un objet Festival à partir de son identifiant.
     *
     * @param id l'identifiant de l'objet Festival à récupérer
     * @return l'objet Festival correspondant à l'identifiant sous forme optionnelle
     */
    Optional<Festival> findById(Long id);

    /**
     * Récupère tous les objets Festival de la base de données.
     *
     * @return la liste des objets Festival de la base de données
     */
    List<Festival> showAllFestivals();
}

