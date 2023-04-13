package fr.simplon.festivals.dao.impl;

import fr.simplon.festivals.entity.Festival;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Cette interface étend l'interface JpaRepository pour fournir des méthodes de base permettant de manipuler des objets Festival dans la base de données.
 */

public interface FestivalRepository extends JpaRepository<Festival, Long> {


}

