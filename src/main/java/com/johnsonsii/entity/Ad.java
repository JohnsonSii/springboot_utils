package com.johnsonsii.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 广告
 * </p>
 *
 * @author johnsonsii
 * @since 2022-06-09 04:30:38
 */
@TableName("t_ad")
public class Ad implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 广告id
     */
    @TableId(value = "ad_id", type = IdType.AUTO)
    private String adId;

    /**
     * 广告类型
     */
    @TableField("ad_type_id")
    private String adTypeId;

    /**
     * 广告标题
     */
    @TableField("ad_title")
    private String adTitle;

    /**
     * 广告的url地址
     */
    @TableField("ad_url")
    private String adUrl;

    /**
     * 广告排序，越小越排在前面
     */
    @TableField("ad_sort")
    private Integer adSort;

    /**
     * 广告开始时间
     */
    @TableField("ad_begin_time")
    private LocalDateTime adBeginTime;

    /**
     * 广告结束时间
     */
    @TableField("ad_end_time")
    private LocalDateTime adEndTime;

    /**
     * 添加广告的时间
     */
    @TableField("ad_add_time")
    private LocalDateTime adAddTime;

    public String getAdId() {
        return adId;
    }

    public Ad setAdId(String adId) {
        this.adId = adId;
        return this;
    }
    public String getAdTypeId() {
        return adTypeId;
    }

    public Ad setAdTypeId(String adTypeId) {
        this.adTypeId = adTypeId;
        return this;
    }
    public String getAdTitle() {
        return adTitle;
    }

    public Ad setAdTitle(String adTitle) {
        this.adTitle = adTitle;
        return this;
    }
    public String getAdUrl() {
        return adUrl;
    }

    public Ad setAdUrl(String adUrl) {
        this.adUrl = adUrl;
        return this;
    }
    public Integer getAdSort() {
        return adSort;
    }

    public Ad setAdSort(Integer adSort) {
        this.adSort = adSort;
        return this;
    }
    public LocalDateTime getAdBeginTime() {
        return adBeginTime;
    }

    public Ad setAdBeginTime(LocalDateTime adBeginTime) {
        this.adBeginTime = adBeginTime;
        return this;
    }
    public LocalDateTime getAdEndTime() {
        return adEndTime;
    }

    public Ad setAdEndTime(LocalDateTime adEndTime) {
        this.adEndTime = adEndTime;
        return this;
    }
    public LocalDateTime getAdAddTime() {
        return adAddTime;
    }

    public Ad setAdAddTime(LocalDateTime adAddTime) {
        this.adAddTime = adAddTime;
        return this;
    }

    @Override
    public String toString() {
        return "Ad{" +
            "adId=" + adId +
            ", adTypeId=" + adTypeId +
            ", adTitle=" + adTitle +
            ", adUrl=" + adUrl +
            ", adSort=" + adSort +
            ", adBeginTime=" + adBeginTime +
            ", adEndTime=" + adEndTime +
            ", adAddTime=" + adAddTime +
        "}";
    }
}
