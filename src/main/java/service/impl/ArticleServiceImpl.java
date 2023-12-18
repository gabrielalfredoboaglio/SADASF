package service.impl;

import entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ArticleRepository;
import service.ArticleService;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepository articleRepository;

    @Autowired
    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public List<Article> getAllArticles() {
        return null;
    }

    @Override
    public Article getArticleById(Long articleId) {
        return null;
    }

    @Override
    public void saveArticle(Article article) {

    }

    @Override
    public void updateArticle(Long articleId, Article updatedArticle) {

    }

    @Override
    public void deleteArticle(Long articleId) {

    }


}

