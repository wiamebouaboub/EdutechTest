package edutech.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import lombok.*;

@Data
@Entity // Une entité JPA
@Table(name = "Partiememory")
public class PartieMemory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "partiememory_id")
    private Integer id;

    @Column(name = "partiememory_valeur")
    private int valeur;

    @ManyToOne
    PartiesGagnees partiesgagneesm;

    @NonNull
    @ManyToOne(optional = false) // obligatoire, la clé étrangère ne doit pas être nulle
    Memory memory;

    @OneToMany(mappedBy = "partiememory")
    @ToString.Exclude
    private List<TableMemory> tablememory = new ArrayList<>();
}
