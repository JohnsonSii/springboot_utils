package com.johnsonsii.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 广告类型
 * </p>
 *
 * @author johnsonsii
 * @since 2022-06-09 04:30:39
 */
@TableName("t_ad_type")
public class AdType implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 广告类型id
     */
    @TableId(value = "ad_type_id", type = IdType.AUTO)
    private String adTypeId;

    /**
     * 广告类型名称
     */
    @TableField("ad_type_title")
    private String adTypeTitle;

    /**
     * 广告标识（首页顶部广告，轮播图广告，文章详情广告）
     */
    @TableField("ad_type_tag")
    private String adTypeTag;

    /**
     * 广告类型排序，越小越靠前
     */
    @TableField("ad_type_sort")
    private Integer adTypeSort;

    /**
     * 广告类型添加时间
     */
    @TableField("ad_type_add_time")
    private LocalDateTime adTypeAddTime;

    public String getAdTypeId() {
        return adTypeId;
    }

    public AdType setAdTypeId(String adTypeId) {
        this.adTypeId = adTypeId;
        return this;
    }
    public String getAdTypeTitle() {
        return adTypeTitle;
    }

    public AdType setAdTypeTitle(String adTypeTitle) {
        this.adTypeTitle = adTypeTitle;
        return this;
    }
    public String getAdTypeTag() {
        return adTypeTag;
    }

    public AdType setAdTypeTag(String adTypeTag) {
        this.adTypeTag = adTypeTag;
        return this;
    }
    public Integer getAdTypeSort() {
        return adTypeSort;
    }

    public AdType setAdTypeSort(Integer adTypeSort) {
        this.adTypeSort = adTypeSort;
        return this;
    }
    public LocalDateTime getAdTypeAddTime() {
        return adTypeAddTime;
    }

    public AdType setAdTypeAddTime(LocalDateTime adTypeAddTime) {
        this.adTypeAddTime = adTypeAddTime;
        return this;
    }

    @Override
    public String toString() {
        return "AdType{" +
            "adTypeId=" + adTypeId +
            ", adTypeTitle=" + adTypeTitle +
            ", adTypeTag=" + adTypeTag +
            ", adTypeSort=" + adTypeSort +
            ", adTypeAddTime=" + adTypeAddTime +
        "}";
    }
}
