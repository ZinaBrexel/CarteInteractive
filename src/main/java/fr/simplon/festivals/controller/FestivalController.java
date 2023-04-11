package fr.simplon.festivals.controller;

import fr.simplon.festivals.dao.FestivalDao;
import fr.simplon.festivals.entity.Festival;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class FestivalController {

    @Autowired
    private FestivalDao festivalDao;

    @GetMapping("/")
    public String showAllFestival(Model model){
        List<Festival> festivals = festivalDao.showAllFestivals();
        model.addAttribute("festivals", festivals);
        return "index";
    }
    @GetMapping("/formulaire")
    public String afficherFormulaire(Model model){
        model.addAttribute("festival", new Festival());
        return "/formulaire";
    }

    @PostMapping("/ajouterFestival")
    public String enregistrerFestival(@ModelAttribute("festival") Festival festival){
        festivalDao.save(festival);
        return "redirect:/";
    }
}

