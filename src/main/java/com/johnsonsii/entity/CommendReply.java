package com.johnsonsii.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 评论回复
 * </p>
 *
 * @author johnsonsii
 * @since 2022-06-09 04:30:39
 */
@TableName("t_commend_reply")
public class CommendReply implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 评论回复id
     */
    @TableId(value = "comment_reply_id", type = IdType.AUTO)
    private String commentReplyId;

    /**
     * 评论id
     */
    @TableField("comment_id")
    private String commentId;

    /**
     * 回复评论的人id
     */
    @TableField("reply_user_id")
    private String replyUserId;

    /**
     * 继续回复的人id
     */
    @TableField("secondly_user_id")
    private String secondlyUserId;

    /**
     * 评论回复的时间
     */
    @TableField("comment_reply_time")
    private LocalDateTime commentReplyTime;

    public String getCommentReplyId() {
        return commentReplyId;
    }

    public CommendReply setCommentReplyId(String commentReplyId) {
        this.commentReplyId = commentReplyId;
        return this;
    }
    public String getCommentId() {
        return commentId;
    }

    public CommendReply setCommentId(String commentId) {
        this.commentId = commentId;
        return this;
    }
    public String getReplyUserId() {
        return replyUserId;
    }

    public CommendReply setReplyUserId(String replyUserId) {
        this.replyUserId = replyUserId;
        return this;
    }
    public String getSecondlyUserId() {
        return secondlyUserId;
    }

    public CommendReply setSecondlyUserId(String secondlyUserId) {
        this.secondlyUserId = secondlyUserId;
        return this;
    }
    public LocalDateTime getCommentReplyTime() {
        return commentReplyTime;
    }

    public CommendReply setCommentReplyTime(LocalDateTime commentReplyTime) {
        this.commentReplyTime = commentReplyTime;
        return this;
    }

    @Override
    public String toString() {
        return "CommendReply{" +
            "commentReplyId=" + commentReplyId +
            ", commentId=" + commentId +
            ", replyUserId=" + replyUserId +
            ", secondlyUserId=" + secondlyUserId +
            ", commentReplyTime=" + commentReplyTime +
        "}";
    }
}
