package repository;

import entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Long> {
    // Puedes agregar consultas personalizadas si es necesario
}
