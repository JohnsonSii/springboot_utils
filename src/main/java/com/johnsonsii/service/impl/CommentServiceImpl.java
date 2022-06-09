package com.johnsonsii.service.impl;

import com.johnsonsii.entity.Comment;
import com.johnsonsii.mapper.CommentMapper;
import com.johnsonsii.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章评论 服务实现类
 * </p>
 *
 * @author johnsonsii
 * @since 2022-06-09 04:30:39
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
