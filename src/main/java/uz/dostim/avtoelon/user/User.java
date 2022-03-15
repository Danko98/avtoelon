package uz.dostim.avtoelon.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Lazy;
import uz.dostim.avtoelon.entity.Announce;
import uz.dostim.avtoelon.entity.Region;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false, unique = true)
    String phoneNumber;

    @ManyToOne
    Region region;

    @Lazy
    @OneToMany
    List<Announce> announceList;


}
