package com.johnsonsii.service.impl;

import com.johnsonsii.entity.User;
import com.johnsonsii.mapper.UserMapper;
import com.johnsonsii.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户 服务实现类
 * </p>
 *
 * @author johnsonsii
 * @since 2022-06-09 04:30:39
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
