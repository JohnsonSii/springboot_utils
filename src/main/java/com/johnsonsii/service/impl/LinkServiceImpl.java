package com.johnsonsii.service.impl;

import com.johnsonsii.entity.Link;
import com.johnsonsii.mapper.LinkMapper;
import com.johnsonsii.service.LinkService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 友情链接 服务实现类
 * </p>
 *
 * @author johnsonsii
 * @since 2022-06-09 04:30:39
 */
@Service
public class LinkServiceImpl extends ServiceImpl<LinkMapper, Link> implements LinkService {

}
