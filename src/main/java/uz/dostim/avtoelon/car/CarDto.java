package uz.dostim.avtoelon.car;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import uz.dostim.avtoelon.enums.Color;
import uz.dostim.avtoelon.enums.Energy;
import uz.dostim.avtoelon.enums.Version;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CarDto {

    private Long brandId;     // Automobil brendi
    private Long UserId;
    private Integer years;       // Nechanchi yil ishlab chiqarilgani
    private String description; // Qo'shimcha ma'lumot
    private double price;     // Narxi
    private long walking;     // Qancha masofa yurgani
    private Color color;      // Avtomobil rangi
    private Version version;  // Nechanchi pozitsiyaligi
    private Energy energy;    // Foydalanadigan yoqilg'i yo energiyasi
    boolean agreement;        // Narxini arzonlashtiradimi
    boolean isRented;         // Ijaraga beriladimi
    boolean isAutomatic;      // Uzatmalar qutisi aftomatikmi yoki ruchnoymi
    private LocalDateTime createdDate;

}
