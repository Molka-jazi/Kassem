package com.example.atelier1.Service;

import com.example.atelier1.entities.Contrat;
import com.example.atelier1.entities.Equipe;

import java.util.List;

public interface IEquipeService {
    boolean updateEquipe(Equipe equipe);
    boolean deleteEquipe(Integer idEquipe);
    int addEquipe(Equipe equipe);
    Equipe getEquipe(int idequipe);
    List<Equipe> getEquipe();

    List<Equipe> getContrat();

}

