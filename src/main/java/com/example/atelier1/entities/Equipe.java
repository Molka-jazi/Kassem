package com.example.atelier1.entities;



import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder

@Table(name="Equipe")
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false )
    private int idEquipe;

    private String nomEquipe;

    @Enumerated(EnumType.STRING)
    private Niveau niveau ;

    @OneToOne
    private  DetailEquipe detailEquipe;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Etudiant> etudiants;
}
