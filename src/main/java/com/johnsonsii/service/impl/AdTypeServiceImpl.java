package com.johnsonsii.service.impl;

import com.johnsonsii.entity.AdType;
import com.johnsonsii.mapper.AdTypeMapper;
import com.johnsonsii.service.AdTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 广告类型 服务实现类
 * </p>
 *
 * @author johnsonsii
 * @since 2022-06-09 04:30:39
 */
@Service
public class AdTypeServiceImpl extends ServiceImpl<AdTypeMapper, AdType> implements AdTypeService {

}
