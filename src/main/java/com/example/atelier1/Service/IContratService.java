package com.example.atelier1.Service;

import com.example.atelier1.entities.Contrat;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface IContratService {
    boolean updateContrat(Contrat c);
    boolean deleteContrat(Integer idContrat);
    int addContrat(Contrat contrat);
    Contrat getContrat(int contrat);
    List<Contrat> getContrat();

    public List<Contrat> OrderBy();
 }
