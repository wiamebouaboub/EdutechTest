package edutech.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "Matiere")
public class Matiere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "matiere_id")
    private Integer id;

    @NonNull
    @Column(name = "matiere_intitule")
    private String intitule;

    @OneToMany(mappedBy = "matiere")
    @ToString.Exclude
    private List<Chapitre> chapitres = new ArrayList<>();
}
