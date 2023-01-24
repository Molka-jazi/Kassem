package com.example.atelier1.entities;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
@Slf4j
@Service

@Table(name = "Contrat")
public class Contrat implements Serializable {
    //id, GeneratedValue , ColumnNotNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //GenerationType.Auto : la generation de la cle primaire est auto
    //GenerationType.identity : l'identite de la table
    //generationType.Sequence :auto mais nous definisssions la sequence i=i+2
    @Column(nullable = false ,name ="idContract" ,length=50, unique=true)
    private Integer idContract;

    @Temporal(TemporalType.DATE)
    @Column(name ="dateDebutContrat" )
    private Date dateDebutContrat;

    @Temporal(TemporalType.DATE)
    @Column(name ="dateFinContract" )
    private Date dateFinContract;
    //enumeration
    @Enumerated(EnumType.STRING)
    @Column(name ="specialite" )
    private Specialite specialite;

    @Column(name ="archive" )
    private Boolean archive;

    @ManyToOne
    Etudiant etudiant;


}