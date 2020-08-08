package com.yanle.i18nplatform.service.impl;

import com.yanle.i18nplatform.entity.User;
import com.yanle.i18nplatform.mapper.UserMapper;
import com.yanle.i18nplatform.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yanle
 * @since 2020-08-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
