package com.example.atelier1.Controller;

import com.example.atelier1.Service.IContratService;
import com.example.atelier1.Service.IUniversiteService;
import com.example.atelier1.entities.Contrat;
import com.example.atelier1.entities.Universite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UniversiteController {
    @Autowired
    IUniversiteService iUniversiteService;

    @PostMapping("/save-Universite")
    @ResponseBody
    public int addUniversite(@RequestBody Universite Universite){

        return iUniversiteService.addUniversite(Universite);
    }


    @GetMapping("/retrieve-all-Universite")
    @ResponseBody
    public List<Universite> getUniversites()
    {
        List<Universite> universiteList=iUniversiteService.getUniversite();
        return universiteList;
    }



    @GetMapping("/retrieve-Universite/{idUniversite}")
    @ResponseBody
    public Universite getUniversite(@PathVariable("idUniversite") Integer idUniversite)
    {
        return iUniversiteService.getUniversite(idUniversite);
    }



    @DeleteMapping("/delete-Universite/{idUniversite}")
    @ResponseBody
    public Universite deleteUniversite(@PathVariable("idUniversite") Integer idUniversite)
    {
        iUniversiteService.deleteUniversite(idUniversite);
        return null;
    }
}
