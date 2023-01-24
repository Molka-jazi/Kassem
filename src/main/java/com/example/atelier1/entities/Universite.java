package com.example.atelier1.entities;


import com.sun.istack.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.nio.MappedByteBuffer;
import java.util.List;
import java.util.Set;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)


@Table(name = "Universite")
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false ,name ="idUniv" ,length=50, unique=true)
    private int idUniv;

    @Column(name ="nomUniv" )
    private String nomUniv;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Departement> departements;

    //type "LAZY" wa9teli toufa bel many el association

}