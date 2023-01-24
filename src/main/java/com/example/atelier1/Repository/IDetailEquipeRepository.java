package com.example.atelier1.Repository;

import com.example.atelier1.entities.DetailEquipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetailEquipeRepository extends JpaRepository<DetailEquipe,Integer> {
}
