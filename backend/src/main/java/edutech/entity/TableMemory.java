package edutech.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "Tablememory")
public class TableMemory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tablememory_id")
    private Integer id;

    @NonNull
    @Column(name = "tablememory_intitule")
    private String intitule;

    @NonNull
    @ManyToOne
    PartieMemory partiememory;

    @OneToMany(mappedBy = "tablememory")
    @ToString.Exclude
    private List<PaireMemory> pairememory = new ArrayList<>();
}
