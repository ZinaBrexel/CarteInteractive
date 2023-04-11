package fr.simplon.festivals.dao;

import fr.simplon.festivals.entity.Festival;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface FestivalDao {
    Festival save(Festival festival);

    List<Festival> saveAll(List<Festival> festivals);
    Festival findOne(Long id);
    Optional<Festival> findById(Long id);

    List<Festival> findAll();

    List<Festival> showAllFestivals();
    void delete(Long id);
}

