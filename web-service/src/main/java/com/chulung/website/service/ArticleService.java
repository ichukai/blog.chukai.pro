package com.chulung.website.service;

import com.chulung.website.dto.out.Archive;
import com.chulung.website.dto.out.ArticleDraftOut;
import com.chulung.website.dto.out.ArticleOut;
import com.chulung.website.dto.out.PageOut;
import com.chulung.website.model.Article;
import com.chulung.website.model.ArticleDraft;

import java.util.List;

/**
 * @author chulung
 */
public interface ArticleService {
    void deleteArticleDraft(Integer id);

    Article findArticleById(String id);

    List<ArticleOut> findRecommendedArticles();

    List<Article> findPopularArticles();

    List<Article> findRelevancyByArticleId(Integer id);

    PageOut<ArticleDraftOut> findArticleDraftsList(Integer pageIn, Integer columnId);

    ArticleDraftOut findArticleDraft(Integer id);

    Integer insert(ArticleDraft articleDraft);

    boolean update(ArticleDraft articleDraft);

    List<Archive> getArchive();

    PageOut<ArticleOut> getArticlesByTagName(String tagName);

    PageOut<ArticleOut> findArticlePage(Integer page, String column, Integer yearMonth, Integer month);
}