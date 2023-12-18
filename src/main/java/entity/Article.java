package entity;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String articleName;
    private BigDecimal valueInCurrency;
    // Other attributes

    @ManyToOne
    @JoinColumn(name = "legal_entity_id")
    private LegalEntity legalEntity;
    // Other relationships and attributes
}
