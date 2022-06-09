package com.johnsonsii.mapper;

import com.johnsonsii.entity.Comment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 文章评论 Mapper 接口
 * </p>
 *
 * @author johnsonsii
 * @since 2022-06-09 04:30:39
 */
@Mapper
public interface CommentMapper extends BaseMapper<Comment> {

}
