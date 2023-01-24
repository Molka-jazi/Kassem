package com.example.atelier1.Controller;

import com.example.atelier1.Service.IDetailEquipeSevice;
import com.example.atelier1.entities.Contrat;
import com.example.atelier1.entities.DetailEquipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.soap.Detail;
import java.util.List;
 @RestController
public class DetailEquipeController {
    @Autowired
    IDetailEquipeSevice detailEquipeSevice;

    @PostMapping("/save-detailEquipe")
    @ResponseBody
    public int addDetailEquipe(@RequestBody DetailEquipe detailEquipe){

        return detailEquipeSevice.addDetailEquipe(detailEquipe);
    }


    @GetMapping("/retrieve-all-detailEquipe")
    @ResponseBody
    public List<DetailEquipe> getDetailEquipe()
    {
        List<DetailEquipe> DetailEquipeList=detailEquipeSevice.getDetailEquipe();
        return DetailEquipeList;
    }



    @GetMapping("/retrieve-detailEquipe/{idDetailEquipe}")
    @ResponseBody
    public DetailEquipe getDetailEquipe(@PathVariable("idDetailEquipe") Integer idDetailEquipe)
    {
        return detailEquipeSevice.getDetailEquipe(idDetailEquipe);
    }



    @DeleteMapping("/delete-DetailEquipe/{idDetailEquipe}")
    @ResponseBody
    public Contrat deleteDetailEquipe(@PathVariable("idDetailEquipe") Integer idDetailEquipe)
    {
        detailEquipeSevice.deleteDetailEquipe(idDetailEquipe);
        return null;
    }
}
