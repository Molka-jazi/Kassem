package com.example.atelier1.entities;

        import lombok.*;

        import javax.persistence.*;
        import java.io.Serializable;


@Entity(name = "DetailEquipe")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder

public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false ,name ="salle" ,length=50, unique=true)
    private int salle;

    @Column(name="thematique")
    private String thematique;

    @OneToOne(mappedBy = "detailEquipe")
    private Equipe equipe;



}
