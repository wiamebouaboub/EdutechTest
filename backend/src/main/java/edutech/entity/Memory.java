package edutech.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Memory")
public class Memory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "memory_id")
    private Integer id;

    @NonNull
    @Column(name = "memory_intitule")
    private String intitule;

    @OneToMany(mappedBy = "memory")
    @ToString.Exclude
    private List<PartieMemory> partiememory = new ArrayList<>();

    @NonNull
    @ManyToOne(optional = false) // obligatoire, la clé étrangère ne doit pas être nulle
    Cours coursmemory;

};