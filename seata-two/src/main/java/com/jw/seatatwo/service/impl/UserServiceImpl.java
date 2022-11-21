package com.jw.seatatwo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jw.seatatwo.mapper.UserMapper;
import com.jw.seatatwo.pojo.User;
import com.jw.seatatwo.service.IUserService;
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
