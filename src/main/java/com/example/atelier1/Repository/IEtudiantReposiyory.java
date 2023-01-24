package com.example.atelier1.Repository;

import com.example.atelier1.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEtudiantReposiyory extends JpaRepository<Etudiant,Integer> {
}
