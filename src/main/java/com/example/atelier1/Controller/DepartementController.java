package com.example.atelier1.Controller;

import com.example.atelier1.Service.IDepartementService;
import com.example.atelier1.entities.Contrat;
import com.example.atelier1.entities.Departement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartementController {
    @Autowired
    IDepartementService departementService;

    @PostMapping("/save-departement")
    @ResponseBody
    public int addDepartement(@RequestBody Departement departement){

        return departementService.addDepartement(departement);
    }


    @GetMapping("/retrieve-all-departements")
    @ResponseBody
    public List<Departement> getDepartement()
    {
        List<Departement> DepartementList=departementService.getDepartement();
        return DepartementList;
    }

    @GetMapping("/retrieve-departement/{idDepartement}")
    @ResponseBody
    public Departement getDepartement(@PathVariable("idDepartement") Integer idDepartement)
    {
        return departementService.getDepartement(idDepartement);
    }

    @DeleteMapping("/delete-departement/{idDepartement}")
    @ResponseBody
    public Contrat deleteContrat(@PathVariable("idDepartement") Integer idDepartement)
    {
        departementService.deleteDepartement(idDepartement);
        return null;
    }

    @GetMapping("/assignEtudiantToDepartement/{idEtudiant}/{idDepart}")
    @ResponseBody
    public Departement assignEtudiantToDepartement(@PathVariable("idEtudiant") Integer idEtudiant,@PathVariable("idDepart") Integer idDepart)
    {
        return departementService.assignEtudiantToDepartement(idEtudiant,idDepart);
    }

    @GetMapping("/assignUniversiteToDepartement/{idUniversite}/{idDepart}")
    @ResponseBody
    public void assignUniversiteToDepartement(@PathVariable("idUniversite") Integer idUniversite,@PathVariable("idDepart") Integer idDepart){
        departementService.assignUniversiteToDepartement(idUniversite,idDepart);
    }
}
