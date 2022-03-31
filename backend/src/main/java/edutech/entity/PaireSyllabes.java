package edutech.entity;

import javax.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "Pairesyllabes")
public class PaireSyllabes {
    @Id
    @Column(name = "syllabe")
    private String syllabe;

    @NonNull
    @Column(name = "audio")
    private String audio;

    @NonNull
    @ManyToOne(optional = false) // obligatoire, la clé étrangère ne doit pas être nulle
    PartieSyllabes partiesyllabes;
}
