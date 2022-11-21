package com.jw.seataone.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jw.seataone.mapper.UserMapper;
import com.jw.seataone.pojo.User;
import com.jw.seataone.service.IUserService;
import org.springframework.stereotype.Service;

/**
 *  服务实现类
 * @author javertWong
 * @date 2022-11-21
 * @version 1.0.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
