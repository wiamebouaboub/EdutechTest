package edutech.entity;

import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@RequiredArgsConstructor @NoArgsConstructor @ToString
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Integer role_id;
    @Column(name = "name")
    @NonNull
    private String name;

    public Integer getRole_id() {
        return role_id;
    }

    public String getName() {
        return name;
    }
}
