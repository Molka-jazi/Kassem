package com.example.atelier1.Service;

import com.example.atelier1.entities.Contrat;
import com.example.atelier1.entities.Equipe;
import com.example.atelier1.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    boolean updateEtudiant(Etudiant etudiant);
    boolean deleteEtudiant(Integer idetudiant);
    int addEtudiant(Etudiant etudiant);
    Etudiant getEtudiant(int etudiant);
    List<Etudiant> getEtudiant();
    Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer
            idEquipe);
    Contrat affectContratToEtudiant (Contrat ce, String nomEtu, String prenomEtu);

    List<Etudiant> getEtudiantsByDepartement (Integer idDepartement);
}
