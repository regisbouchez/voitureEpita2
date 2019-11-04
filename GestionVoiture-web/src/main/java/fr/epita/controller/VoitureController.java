package fr.epita.controller;

import fr.epita.entite.VoitureEntite;
import fr.epita.service.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VoitureController {
    @Autowired
    VoitureService voitureService;

    @RequestMapping("/")
    public String index() {
        voitureService.creerVoiture(new VoitureEntite("Peugeot","308",20000));
        return "on affiche";

    }

}