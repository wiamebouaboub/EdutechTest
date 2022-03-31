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
@Table(name = "Syllabes")
public class Syllabes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "syllabes_id")
    private Integer id;

    @NonNull
    @Column(name = "syllabes_intitule")
    private String intitule;

    @OneToMany(mappedBy = "syllabes")
    @ToString.Exclude
    private List<PartieSyllabes> partiesyllabes = new ArrayList<>();

    @NonNull
    @ManyToOne(optional = false) // obligatoire, la clé étrangère ne doit pas être nulle
    Cours courssyllabes;
}
