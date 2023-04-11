package fr.simplon.festivals.controller;

import fr.simplon.festivals.dao.FestivalDao;
import fr.simplon.festivals.entity.Festival;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class FestivalController {

    @Autowired
    private FestivalDao festivalDao;

    @GetMapping("/")
    public String showAllFestival(Model model) {
        List<Festival> festivals = festivalDao.showAllFestivals();
        model.addAttribute("festivals", festivals);
        return "index";
    }

    @GetMapping("/formulaire")
    public String afficherFormulaire(Model model) {
        model.addAttribute("festival", new Festival());
        return "/formulaire";
    }

    @PostMapping("/ajouterFestival")
    public String enregistrerFestival(@ModelAttribute("festival") Festival festival) {
        festivalDao.save(festival);
        return "redirect:/";
    }
    @GetMapping("/editer/{id}")
    public String afficherFormulaireEdition(@PathVariable Long id, Model model) {
        Optional<Festival> festival = festivalDao.findById(id);
        model.addAttribute("festival", festival.get());
        return "/editer";
    }
    @PostMapping("/editerFestival/{id}")
    public String sauvegarderEdition(@ModelAttribute("festival") Festival festival, @PathVariable Long id) {
        Optional<Festival> festivalToUpdate = festivalDao.findById(id);
        if (festivalToUpdate.isPresent()) {
            Festival festivalUpdated = festivalToUpdate.get();
            festivalUpdated.setId(festival.getId());
            festivalUpdated.setNom(festival.getNom());
            festivalUpdated.setUrl(festival.getUrl());
            festivalUpdated.setVille(festival.getVille());
            festivalUpdated.setCp(festival.getCp());
            festivalUpdated.setLieu(festival.getLieu());
            festivalUpdated.setDebut(festival.getDebut());
            festivalUpdated.setFin(festival.getFin());
            festivalDao.save(festivalUpdated);
        }
        return "redirect:/";
    }


}

