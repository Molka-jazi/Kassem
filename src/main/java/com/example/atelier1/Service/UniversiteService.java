package com.example.atelier1.Service;

import com.example.atelier1.entities.Departement;
import com.example.atelier1.entities.Universite;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UniversiteService implements IUniversiteService{
    @Override
    public boolean updateUniversite(Universite universite) {
        return false;
    }

    @Override
    public boolean deleteUniversite(Integer iduniversite) {
        return false;
    }

    @Override
    public int addUniversite(Universite universite) {
        return 0;
    }

    @Override
    public Universite getUniversite(int iduniversite) {
        return null;
    }

    @Override
    public List<Universite> getUniversite() {
        return null;
    }

    @Override
    public List<Departement> retrieveDepartementsByUniversite(Integer idUniversite) {
        return null;
    }
}
