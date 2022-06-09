package com.johnsonsii.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 文章评论
 * </p>
 *
 * @author johnsonsii
 * @since 2022-06-09 04:30:39
 */
@TableName("t_comment")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文章评论id
     */
    @TableId(value = "comment_id", type = IdType.AUTO)
    private String commentId;

    /**
     * 文章id
     */
    @TableField("article_id")
    private String articleId;

    /**
     * 用户id（评论人）
     */
    @TableField("user_id")
    private String userId;

    /**
     * 评论时间
     */
    @TableField("comment_time")
    private LocalDateTime commentTime;

    /**
     * 点赞次数
     */
    @TableField("comment_like_number")
    private Integer commentLikeNumber;

    public String getCommentId() {
        return commentId;
    }

    public Comment setCommentId(String commentId) {
        this.commentId = commentId;
        return this;
    }
    public String getArticleId() {
        return articleId;
    }

    public Comment setArticleId(String articleId) {
        this.articleId = articleId;
        return this;
    }
    public String getUserId() {
        return userId;
    }

    public Comment setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public LocalDateTime getCommentTime() {
        return commentTime;
    }

    public Comment setCommentTime(LocalDateTime commentTime) {
        this.commentTime = commentTime;
        return this;
    }
    public Integer getCommentLikeNumber() {
        return commentLikeNumber;
    }

    public Comment setCommentLikeNumber(Integer commentLikeNumber) {
        this.commentLikeNumber = commentLikeNumber;
        return this;
    }

    @Override
    public String toString() {
        return "Comment{" +
            "commentId=" + commentId +
            ", articleId=" + articleId +
            ", userId=" + userId +
            ", commentTime=" + commentTime +
            ", commentLikeNumber=" + commentLikeNumber +
        "}";
    }
}
