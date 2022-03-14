package uz.dostim.avtoelon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.dostim.avtoelon.enums.Color;
import uz.dostim.avtoelon.enums.Energy;
import uz.dostim.avtoelon.enums.Version;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @ManyToOne
    Brand brand;
    @OneToOne
    User user;
    @Column(nullable = false)
    Integer years;
    @Column(nullable = false)
    double price;
    @Column(nullable = false)
    Color color;
    @Column(nullable = false)
    long walking;
    @Column(nullable = false)
    Energy energy;

    Version version;
    String description;
    boolean kamiBormi;
    boolean arendaVikupBormi;
    boolean transmission;


}
