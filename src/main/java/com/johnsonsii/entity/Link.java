package com.johnsonsii.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 友情链接
 * </p>
 *
 * @author johnsonsii
 * @since 2022-06-09 04:30:39
 */
@TableName("t_link")
public class Link implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 友情链接id
     */
    @TableId(value = "link_id", type = IdType.AUTO)
    private String linkId;

    /**
     * 链接标题
     */
    @TableField("link_title")
    private String linkTitle;

    /**
     * 友情链接的地址
     */
    @TableField("link_url")
    private String linkUrl;

    /**
     * 友情链接logo
     */
    @TableField("link_logo_url")
    private String linkLogoUrl;

    /**
     * 添加友情链接的时间
     */
    @TableField("link_add_time")
    private LocalDateTime linkAddTime;

    public String getLinkId() {
        return linkId;
    }

    public Link setLinkId(String linkId) {
        this.linkId = linkId;
        return this;
    }
    public String getLinkTitle() {
        return linkTitle;
    }

    public Link setLinkTitle(String linkTitle) {
        this.linkTitle = linkTitle;
        return this;
    }
    public String getLinkUrl() {
        return linkUrl;
    }

    public Link setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
        return this;
    }
    public String getLinkLogoUrl() {
        return linkLogoUrl;
    }

    public Link setLinkLogoUrl(String linkLogoUrl) {
        this.linkLogoUrl = linkLogoUrl;
        return this;
    }
    public LocalDateTime getLinkAddTime() {
        return linkAddTime;
    }

    public Link setLinkAddTime(LocalDateTime linkAddTime) {
        this.linkAddTime = linkAddTime;
        return this;
    }

    @Override
    public String toString() {
        return "Link{" +
            "linkId=" + linkId +
            ", linkTitle=" + linkTitle +
            ", linkUrl=" + linkUrl +
            ", linkLogoUrl=" + linkLogoUrl +
            ", linkAddTime=" + linkAddTime +
        "}";
    }
}
