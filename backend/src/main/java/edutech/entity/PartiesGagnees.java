package edutech.entity;

import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "Partiesgagnees")
public class PartiesGagnees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "partiesgagnees_id")
    private Integer id;

    @OneToMany(mappedBy = "partiesgagneess")
    private List<PartieSyllabes> partiesyllabes = new ArrayList<>();

    @OneToMany(mappedBy = "partiesgagneesm")
    private List<PartieMemory> partiememory = new ArrayList<>();
}
