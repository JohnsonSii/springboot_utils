package com.johnsonsii.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 文章标签对应表
 * </p>
 *
 * @author johnsonsii
 * @since 2022-06-09 04:30:39
 */
@TableName("t_article_tag_list")
public class ArticleTagList implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文章对应标签id
     */
    @TableId(value = "article_tag_list_id", type = IdType.AUTO)
    private String articleTagListId;

    /**
     * 文章id
     */
    @TableField("article_id")
    private String articleId;

    /**
     * 文章标签id
     */
    @TableField("article_tag_id")
    private String articleTagId;

    public String getArticleTagListId() {
        return articleTagListId;
    }

    public ArticleTagList setArticleTagListId(String articleTagListId) {
        this.articleTagListId = articleTagListId;
        return this;
    }
    public String getArticleId() {
        return articleId;
    }

    public ArticleTagList setArticleId(String articleId) {
        this.articleId = articleId;
        return this;
    }
    public String getArticleTagId() {
        return articleTagId;
    }

    public ArticleTagList setArticleTagId(String articleTagId) {
        this.articleTagId = articleTagId;
        return this;
    }

    @Override
    public String toString() {
        return "ArticleTagList{" +
            "articleTagListId=" + articleTagListId +
            ", articleId=" + articleId +
            ", articleTagId=" + articleTagId +
        "}";
    }
}
