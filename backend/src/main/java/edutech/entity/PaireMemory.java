package edutech.entity;

import javax.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "Pairememory")
public class PaireMemory {
    @Id
    @Column(name = "question")
    private String question;

    @NonNull
    @Column(name = "reponse")
    private String reponse;

    @NonNull
    @ManyToOne(optional = false) // obligatoire, la clé étrangère ne doit pas être nulle
    TableMemory tablememory;

}
