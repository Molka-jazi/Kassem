package com.example.atelier1.Controller;

import com.example.atelier1.Service.IContratService;
import com.example.atelier1.Service.IEtudiantService;
import com.example.atelier1.entities.Contrat;
import com.example.atelier1.entities.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class EtudiantController {
    @Autowired
    IEtudiantService iEtudiantService;


    @PostMapping("/save-Etudiant")
    @ResponseBody
    public int addEtudiant(@RequestBody Etudiant etudiant){

        return iEtudiantService.addEtudiant(etudiant);
    }


    @GetMapping("/retrieve-all-Etudiant")
    @ResponseBody
    public List<Etudiant> getEtudiant()
    {
        List<Etudiant> contratList=iEtudiantService.getEtudiant();
        return contratList;
    }



    @GetMapping("/retrieve-etudiant/{idEtudiant}")
    @ResponseBody
    public Etudiant getContrat(@PathVariable("idEtudiant") Integer idEtudiant)
    {
        return iEtudiantService.getEtudiant(idEtudiant);
    }



    @DeleteMapping("/delete-Etudiant/{idEtudiant}")
    @ResponseBody
    public Etudiant deleteContrat(@PathVariable("idEtudiant") Integer idEtudiant)
    {
        iEtudiantService.deleteEtudiant(idEtudiant);
        return null;
    }
}
