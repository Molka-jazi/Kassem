package com.example.atelier1.Controller;

import com.example.atelier1.Repository.IContratRepository;
import com.example.atelier1.Service.IContratService;
import com.example.atelier1.entities.Contrat;
import com.example.atelier1.entities.Departement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContratController {

    @Autowired
    IContratService contratService;


    @PostMapping("/save-contact")
    @ResponseBody
    public int addContrat(@RequestBody Contrat contrat){

        return contratService.addContrat(contrat);
    }


    @GetMapping("/retrieve-all-contrats")
    @ResponseBody
    public List<Contrat> getContrats()
    {
        List<Contrat> contratList=contratService.getContrat();
        return contratList;
    }



    @GetMapping("/retrieve-contact/{idContrat}")
    @ResponseBody
    public Contrat getContrat(@PathVariable("idContrat") Integer idContrat)
    {
        return contratService.getContrat(idContrat);
    }

    @GetMapping("/get")
    @ResponseBody
    public List<Contrat> get()
    {
        List<Contrat> contratList=contratService.OrderBy();
        return contratList;
    }





}
