package com.johnsonsii.service.impl;

import com.johnsonsii.entity.Article;
import com.johnsonsii.mapper.ArticleMapper;
import com.johnsonsii.service.ArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章 服务实现类
 * </p>
 *
 * @author johnsonsii
 * @since 2022-06-09 04:30:39
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

}
