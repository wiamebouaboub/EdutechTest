package edutech.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "Chapitre")
public class Chapitre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chapitre_id")
    private Integer id;

    @NonNull
    @Column(name = "chapitre_intitule")
    private String intitule;

    @NonNull
    @ManyToOne(optional = false) // obligatoire, la clé étrangère ne doit pas être nulle
    @ToString.Exclude
    Matiere matiere;

    @OneToMany(mappedBy = "chapitre")
    @ToString.Exclude
    private List<Cours> cours = new ArrayList<>();
}
