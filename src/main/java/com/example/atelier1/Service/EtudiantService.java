package com.example.atelier1.Service;

import com.example.atelier1.Repository.IEtudiantReposiyory;
import com.example.atelier1.entities.Contrat;
import com.example.atelier1.entities.Equipe;
import com.example.atelier1.entities.Etudiant;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantService implements IEtudiantService{
    @Autowired
    IEtudiantReposiyory iEtudiantReposiyory;
    @Override
    public boolean updateEtudiant(Etudiant etudiant) {
        if(iEtudiantReposiyory.existsById(etudiant.getIdEtudiant())){
            iEtudiantReposiyory.save(etudiant);
            return true;
        }else{
            return false;
        }    }

    @Override
    public boolean deleteEtudiant(Integer idetudiant) {
        if(iEtudiantReposiyory.existsById(idetudiant)){
            iEtudiantReposiyory.deleteById(idetudiant);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int addEtudiant(Etudiant etudiant) {
        return iEtudiantReposiyory.save(etudiant).getIdEtudiant();
    }

    @Override
    public Etudiant getEtudiant(int etudiant) {
        return iEtudiantReposiyory.findById(etudiant).get();
    }

    @Override
    public List<Etudiant> getEtudiant() {
        return  iEtudiantReposiyory.findAll();
    }

    @Override
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe) {
        return null;
    }

    @Override
    public Contrat affectContratToEtudiant(Contrat ce, String nomEtu, String prenomEtu) {
        return null;
    }

    @Override
    public List<Etudiant> getEtudiantsByDepartement(Integer idDepartement) {
        return null;
    }


}
