package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    private final DipendenteJDBCTemp dipendenteJDBCTemp;

    @Autowired
    public MyController(DipendenteJDBCTemp dipendenteJDBCTemp) {
        this.dipendenteJDBCTemp = dipendenteJDBCTemp;
    }
    @GetMapping("/")
    public String getForm() {
    	return "form";
    }
    

    @PostMapping("/inserisci-dipendente")
    public String inserisciDipendente(
            @RequestParam("cognome") String cognome,
            @RequestParam("mansione") String mansione,
            @RequestParam("stipendio") double stipendio) {
        dipendenteJDBCTemp.insertDipendente(cognome, mansione, stipendio);
        return "redirect:/";
    }
}
