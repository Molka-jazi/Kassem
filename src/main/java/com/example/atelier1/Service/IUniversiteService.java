package com.example.atelier1.Service;

import com.example.atelier1.entities.Departement;
import com.example.atelier1.entities.Etudiant;
import com.example.atelier1.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    boolean updateUniversite(Universite universite);
    boolean deleteUniversite(Integer iduniversite);
    int addUniversite(Universite universite);
    Universite getUniversite(int iduniversite);
    List<Universite> getUniversite();
    public List<Departement> retrieveDepartementsByUniversite(Integer idUniversite);
}
