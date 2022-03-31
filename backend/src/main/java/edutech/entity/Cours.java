package edutech.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "Cours")
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cours_id")
    private Integer id;

    @NonNull
    @Column(name = "cours_intitule")
    private String intitule;

    @NonNull
    @ManyToOne(optional = false) // obligatoire, la clé étrangère ne doit pas être nulle
    Chapitre chapitre;

    @OneToMany(mappedBy = "coursmemory")
    @ToString.Exclude
    private List<Memory> memory = new ArrayList<>();

    @OneToMany(mappedBy = "courssyllabes")
    @ToString.Exclude
    private List<Syllabes> syllabes = new ArrayList<>();
}
