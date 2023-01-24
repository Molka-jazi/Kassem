package com.example.atelier1.Repository;


import com.example.atelier1.entities.Contrat;
import com.example.atelier1.entities.Niveau;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
@Repository
public interface IContratRepository extends JpaRepository<Contrat,Integer> {
     //jpa
    //Select c.archive from contrat c join etudiant e on(c.idEtudiant=e.idetudiant)join etudiant_equipe ee on (e.etudiant=ee.idequipe) where datedebutcontrat>21/10/2022 and eq.niveau="Senior"
    List<Boolean> findArchiveContratByDateDebutContratAfterAndEtudiantEquipesNiveau(Date d, Niveau n);

    //jpql=on selctionne des objet
    //native query = sql mouch jpql

 //  @Query(value = "select c from Contrat c join Etudiant e on (c.etudiant.idEtudiant=e.idEtudiant) join Departement d on (e.departement.idDepart=d.idDepart) join  Universite   u on (d = :departements) order by u.idUniv " ) faux
 @Query("select c from Contrat c join Universite  u on (c.etudiant.departement member u.departements) order by u.idUniv")
   List<Contrat> x1();



}
