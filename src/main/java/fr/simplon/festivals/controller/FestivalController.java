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

/**
 * Constructeur par défaut de la classe FestivalController.
 * Il est utilisé pour injecter automatiquement le DAO FestivalDao par Spring.
 */
@Controller
public class FestivalController {

    /**
     * Le DAO FestivalDao est injecté automatiquement par Spring.
     */
    @Autowired
    private FestivalDao festivalDao;


    /**
     * Affiche la liste de tous les festivals dans le modèle et renvoie la vue "index".
     *
     * @param model le modèle de la vue
     * @return la vue "index"
     */
    @GetMapping("/")
    public String showAllFestival(Model model) {
        List<Festival> festivals = festivalDao.showAllFestivals();
        model.addAttribute("festivals", festivals);
        return "index";
    }

    /**
     * Affiche le formulaire d'ajout d'un festival dans le modèle et renvoie la vue "formulaire".
     *
     * @param model le modèle de la vue
     * @return la vue "formulaire"
     */
    @GetMapping("/formulaire")
    public String afficherFormulaire(Model model) {
        model.addAttribute("festival", new Festival());
        return "/formulaire";
    }

    /**
     * Enregistre un festival dans la base de données et redirige vers la page d'accueil.
     *
     * @param festival le festival à enregistrer
     * @return une redirection vers la page d'accueil
     */
    @PostMapping("/ajouterFestival")
    public String enregistrerFestival(@ModelAttribute("festival") Festival festival) {
        festivalDao.save(festival);
        return "redirect:/";
    }

    /**
     * Affiche le formulaire d'édition d'un festival existant dans le modèle et renvoie la vue "editer".
     *
     * @param id l'identifiant du festival à éditer
     * @param model le modèle de la vue
     * @return la vue "editer"
     */
    @GetMapping("/editer/{id}")
    public String afficherFormulaireEdition(@PathVariable Long id, Model model) {
        Optional<Festival> festival = festivalDao.findById(id);
        model.addAttribute("festival", festival.get());
        return "/editer";
    }

    /**
     * Sauvegarde les modifications apportées à un festival existant dans la base de données et redirige vers la page d'accueil.
     *
     * @param festival le festival modifié
     * @param id l'identifiant du festival à modifier
     * @return une redirection vers la page d'accueil
     */
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

