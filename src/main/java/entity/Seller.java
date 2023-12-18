package entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    // Otros atributos

    @OneToMany(mappedBy = "seller")
    private List<Segment> segments;
    // Otros atributos y relaciones
}

