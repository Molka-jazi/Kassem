package com.example.atelier1.Service;

import com.example.atelier1.entities.Departement;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface IDepartementService {
    boolean updateDepartement(Departement departement);
    boolean deleteDepartement(Integer iddepartement);
    int addDepartement(Departement departement);
    Departement getDepartement(Integer idDepartement);
    List<Departement> getDepartement();
    public Departement assignEtudiantToDepartement (Integer etudiantId, Integer departementId) ;
    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement);

}
