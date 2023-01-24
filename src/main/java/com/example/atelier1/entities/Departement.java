package com.example.atelier1.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

import lombok.extern.slf4j.Slf4j;



@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder

@Table(name = "Departement")
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name="idDepart", length = 50,unique=true)
    private int idDepart;

    @Column(name ="nomDepart" )
    private String nomDepart;


}
