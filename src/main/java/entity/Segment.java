package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Segment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String segmentName;
    // Otros atributos

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller seller;

    @OneToMany(mappedBy = "segment")
    private List<Brand> brands;
    // Otros atributos y relaciones
}


