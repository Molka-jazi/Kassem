package com.example.atelier1.entities;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity (name = "Etudiant")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false ,name ="idEtudiant" ,length=50, unique=true)
    private int idEtudiant;

    @Column(name ="prenomE" )
    private String prenomE;

    @Enumerated(EnumType.STRING)
    @Column(name = "option")
    private Option option ;


    @OneToMany(cascade = CascadeType.ALL, mappedBy="etudiant")
    private Set<Contrat> contrats;

    @ManyToOne
    private  Departement departement;

    @ManyToMany(mappedBy="etudiants", cascade = CascadeType.ALL)
    private List<Equipe> equipes;


}

