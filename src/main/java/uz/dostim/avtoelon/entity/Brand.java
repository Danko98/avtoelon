package uz.dostim.avtoelon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    long sss;

    @Column(nullable = false)
    String name;

    @OneToMany
    List<Model> modelList;

}
