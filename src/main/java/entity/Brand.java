package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brandName;
    // Otros atributos

    @ManyToOne
    @JoinColumn(name = "segment_id")
    private Segment segment;

    // Otros atributos y relaciones
}



























