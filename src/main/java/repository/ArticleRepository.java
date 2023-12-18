package repository;

import entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    // Puedes agregar consultas personalizadas si es necesario
}
