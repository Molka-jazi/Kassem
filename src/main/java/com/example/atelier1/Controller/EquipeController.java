package com.example.atelier1.Controller;

import com.example.atelier1.Repository.IEquipeRepository;
import com.example.atelier1.Service.IContratService;
import com.example.atelier1.Service.IEquipeService;
import com.example.atelier1.entities.Contrat;
import com.example.atelier1.entities.Equipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class EquipeController {
   @Autowired
    IEquipeService iEquipeService;

    @PostMapping("/save-Equipe")
    @ResponseBody
    public int addContrat(@RequestBody Equipe equipe){

        return iEquipeService.addEquipe(equipe);
    }


    @GetMapping("/retrieve-all-Equipe")
    @ResponseBody
    public List<Equipe> getContrats()
    {
        List<Equipe> contratList=iEquipeService.getEquipe();
        return contratList;
    }



    @GetMapping("/retrieve-Equipe/{idEquipe}")
    @ResponseBody
    public Equipe getContrat(@PathVariable("idEquipe") Integer idEquipe)
    {
        return iEquipeService.getEquipe(idEquipe);
    }



    @DeleteMapping("/delete-Equipe/{idEquipe}")
    @ResponseBody
    public Equipe deleteContrat(@PathVariable("idEquipe") Integer idEquipe)
    {
        iEquipeService.deleteEquipe(idEquipe);
        return null;
    }
}
