package ut.cs.ee.wsd2018pV.peabVaatama.andmed;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@Table(name = "kasutajad")

public class Kasutajad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String perenimi;
    private String eesnimi;
    private String epost;


}
