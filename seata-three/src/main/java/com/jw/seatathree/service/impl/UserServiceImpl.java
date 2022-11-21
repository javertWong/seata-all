package com.jw.seatathree.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jw.seatathree.mapper.UserMapper;
import com.jw.seatathree.pojo.User;
import com.jw.seatathree.service.IUserService;
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
