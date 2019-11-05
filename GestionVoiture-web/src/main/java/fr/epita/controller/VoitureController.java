package fr.epita.controller;

import fr.epita.entite.VoitureEntite;
import fr.epita.service.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VoitureController {
    @Autowired
    private VoitureService voitureService;

    @Autowired
    private JmsTemplate jmsTemplate;

    @RequestMapping("/")
    public String index() {
        voitureService.creerVoiture(new VoitureEntite("Peugeot","308",20000));
        jmsTemplate.convertAndSend("carNotification", "Hello");
        System.out.println("notifaction envoyée");
        return "on affiche";

    }

}