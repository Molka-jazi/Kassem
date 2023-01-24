package com.example.atelier1.Service;

import com.example.atelier1.Repository.IDepartementRepository;
import com.example.atelier1.Repository.IEquipeRepository;
import com.example.atelier1.entities.Departement;
import com.example.atelier1.entities.Etudiant;
import com.example.atelier1.entities.Universite;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
@Service
@AllArgsConstructor
public class DepartementService implements IDepartementService {
    @Autowired
    IDepartementRepository iDepartementRepository;

    @Autowired
    IEtudiantService etudiantService;

    @Autowired
    IUniversiteService universiteService;
    @Override
    public boolean updateDepartement(Departement departement) {
        if(iDepartementRepository.existsById(departement.getIdDepart())){
            iDepartementRepository.save(departement);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean deleteDepartement(Integer iddepartement) {
        if(iDepartementRepository.existsById(iddepartement)){
            iDepartementRepository.deleteById(iddepartement);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int addDepartement(Departement departement) {
        return iDepartementRepository.save(departement).getIdDepart();
    }

    @Override
    public Departement getDepartement(Integer idDepartement) {
        return iDepartementRepository.findById(idDepartement).get();
    }



    @Override
    public List<Departement> getDepartement() {
        return iDepartementRepository.findAll();
    }

    @Override
    public Departement assignEtudiantToDepartement( Integer etudiantId,  Integer idDepart) {
        Etudiant etudiant=etudiantService.getEtudiant(etudiantId);
        Departement departement= getDepartement(idDepart);
        etudiant.setDepartement(departement);
        etudiantService.addEtudiant(etudiant);
        return departement;

    }

    @Override
    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement) {
        Departement departement=getDepartement(idDepartement);
        Universite universite=universiteService.getUniversite(idDepartement);
        universite.getDepartements().add(departement);
        universiteService.addUniversite(universite);

    }
}
