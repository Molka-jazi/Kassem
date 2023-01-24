package com.example.atelier1.Repository;

import com.example.atelier1.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEquipeRepository extends JpaRepository<Equipe,Integer> {
}
