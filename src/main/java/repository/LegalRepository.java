package repository;

import entity.LegalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LegalRepository extends JpaRepository<LegalEntity, Long> {
}
