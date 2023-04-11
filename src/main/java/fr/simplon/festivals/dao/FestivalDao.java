package fr.simplon.festivals.dao;

import fr.simplon.festivals.entity.Festival;
import java.util.List;

public interface FestivalDao {
    Festival save(Festival festival);

    List<Festival> saveAll(List<Festival> festivals);

    Festival findOne(Long id);
    List<Festival> findAll();

    List<Festival> showAllFestivals();
    void delete(Long id);
}

