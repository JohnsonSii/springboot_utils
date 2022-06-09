package com.johnsonsii.service.impl;

import com.johnsonsii.entity.Ad;
import com.johnsonsii.mapper.AdMapper;
import com.johnsonsii.service.AdService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 广告 服务实现类
 * </p>
 *
 * @author johnsonsii
 * @since 2022-06-09 04:30:38
 */
@Service
public class AdServiceImpl extends ServiceImpl<AdMapper, Ad> implements AdService {

}
