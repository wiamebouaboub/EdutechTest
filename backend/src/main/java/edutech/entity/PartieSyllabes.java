package edutech.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "Partiesyllabes")
public class PartieSyllabes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "partiesyllabes_id")
    private Integer id;

    @Column(name = "partiesyllabes_valeur")
    private int valeur;

    @ManyToOne
    PartiesGagnees partiesgagneess;

    @ManyToOne(optional = false) // obligatoire, la clé étrangère ne doit pas être nulle
    Syllabes syllabes;

    @OneToMany(mappedBy = "partiesyllabes")
    @ToString.Exclude
    private List<PaireSyllabes> pairesyllabes = new ArrayList<>();
}
