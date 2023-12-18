package service;

import entity.Article;

import java.util.List;

public interface ArticleService {
    List<Article> getAllArticles();
    Article getArticleById(Long articleId);
    void saveArticle(Article article);
    void updateArticle(Long articleId, Article updatedArticle);
    void deleteArticle(Long articleId);
}

