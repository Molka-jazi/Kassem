package com.example.atelier1.Repository;

import com.example.atelier1.entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUniversiteRepository extends JpaRepository<Universite,Integer> {
}
