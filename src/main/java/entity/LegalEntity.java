package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class LegalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String legalEntityName;
    // Other attributes

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;
    // Other relationships and attributes
}

