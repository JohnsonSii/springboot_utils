package com.johnsonsii.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 文章
 * </p>
 *
 * @author johnsonsii
 * @since 2022-06-09 04:30:39
 */
@TableName("t_article")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文章id
     */
    @TableId(value = "article_id", type = IdType.AUTO)
    private String articleId;

    /**
     * 用户id
     */
    @TableField("user_id")
    private String userId;

    /**
     * 文章标题
     */
    @TableField("article_title")
    private String articleTitle;

    /**
     * 文章添加时间
     */
    @TableField("article_add_time")
    private LocalDateTime articleAddTime;

    /**
     * 文章内容
     */
    @TableField("article_content")
    private String articleContent;

    /**
     * 点赞次数
     */
    @TableField("article_like_number")
    private Integer articleLikeNumber;

    /**
     * 浏览次数
     */
    @TableField("article_view_number")
    private Integer articleViewNumber;

    /**
     * 收藏次数
     */
    @TableField("article_favorite_number")
    private Integer articleFavoriteNumber;

    public String getArticleId() {
        return articleId;
    }

    public Article setArticleId(String articleId) {
        this.articleId = articleId;
        return this;
    }
    public String getUserId() {
        return userId;
    }

    public Article setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getArticleTitle() {
        return articleTitle;
    }

    public Article setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
        return this;
    }
    public LocalDateTime getArticleAddTime() {
        return articleAddTime;
    }

    public Article setArticleAddTime(LocalDateTime articleAddTime) {
        this.articleAddTime = articleAddTime;
        return this;
    }
    public String getArticleContent() {
        return articleContent;
    }

    public Article setArticleContent(String articleContent) {
        this.articleContent = articleContent;
        return this;
    }
    public Integer getArticleLikeNumber() {
        return articleLikeNumber;
    }

    public Article setArticleLikeNumber(Integer articleLikeNumber) {
        this.articleLikeNumber = articleLikeNumber;
        return this;
    }
    public Integer getArticleViewNumber() {
        return articleViewNumber;
    }

    public Article setArticleViewNumber(Integer articleViewNumber) {
        this.articleViewNumber = articleViewNumber;
        return this;
    }
    public Integer getArticleFavoriteNumber() {
        return articleFavoriteNumber;
    }

    public Article setArticleFavoriteNumber(Integer articleFavoriteNumber) {
        this.articleFavoriteNumber = articleFavoriteNumber;
        return this;
    }

    @Override
    public String toString() {
        return "Article{" +
            "articleId=" + articleId +
            ", userId=" + userId +
            ", articleTitle=" + articleTitle +
            ", articleAddTime=" + articleAddTime +
            ", articleContent=" + articleContent +
            ", articleLikeNumber=" + articleLikeNumber +
            ", articleViewNumber=" + articleViewNumber +
            ", articleFavoriteNumber=" + articleFavoriteNumber +
        "}";
    }
}
