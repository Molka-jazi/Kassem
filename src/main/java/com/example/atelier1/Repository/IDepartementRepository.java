package com.example.atelier1.Repository;

import com.example.atelier1.entities.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDepartementRepository extends JpaRepository<Departement,Integer> {
}
