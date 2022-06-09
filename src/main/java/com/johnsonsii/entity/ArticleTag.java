package com.johnsonsii.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 文章标签
 * </p>
 *
 * @author johnsonsii
 * @since 2022-06-09 04:30:39
 */
@TableName("t_article_tag")
public class ArticleTag implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文章标签id
     */
    @TableId(value = "article_tag_id", type = IdType.AUTO)
    private String articleTagId;

    /**
     * 标签名称
     */
    @TableField("article_tag_name")
    private String articleTagName;

    /**
     * 添加时间
     */
    @TableField("article_tag_add_time")
    private LocalDateTime articleTagAddTime;

    public String getArticleTagId() {
        return articleTagId;
    }

    public ArticleTag setArticleTagId(String articleTagId) {
        this.articleTagId = articleTagId;
        return this;
    }
    public String getArticleTagName() {
        return articleTagName;
    }

    public ArticleTag setArticleTagName(String articleTagName) {
        this.articleTagName = articleTagName;
        return this;
    }
    public LocalDateTime getArticleTagAddTime() {
        return articleTagAddTime;
    }

    public ArticleTag setArticleTagAddTime(LocalDateTime articleTagAddTime) {
        this.articleTagAddTime = articleTagAddTime;
        return this;
    }

    @Override
    public String toString() {
        return "ArticleTag{" +
            "articleTagId=" + articleTagId +
            ", articleTagName=" + articleTagName +
            ", articleTagAddTime=" + articleTagAddTime +
        "}";
    }
}
