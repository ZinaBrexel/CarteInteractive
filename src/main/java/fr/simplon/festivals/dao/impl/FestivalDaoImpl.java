package fr.simplon.festivals.dao.impl;

import fr.simplon.festivals.dao.FestivalDao;
import fr.simplon.festivals.entity.Festival;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class FestivalDaoImpl implements FestivalDao {

    @Autowired
    private FestivalRepository festivalRepository;

    @Override
    public Festival save(Festival festival) {
        return festivalRepository.save(festival);
    }

    @Override
    public List<Festival> saveAll(List<Festival> festivals) {
        return festivalRepository.saveAll(festivals);
    }

    @Override
    public Festival findOne(Long id) {
        return festivalRepository.findById(id).orElse(null);
    }

    @Override
    public List<Festival> findAll() {
        return festivalRepository.findAll();
    }

    @Override
    public List<Festival> showAllFestivals(){
        return festivalRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        festivalRepository.deleteById(id);
    }
}
