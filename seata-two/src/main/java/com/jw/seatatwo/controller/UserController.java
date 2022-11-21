package com.jw.seatatwo.controller;


import com.jw.seatatwo.pojo.User;
import com.jw.seatatwo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *  前端控制器
 * @author javertWong
 * @date 2022-11-21
 * @version 1.0.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/insert")
    public String insert() {
        User user = new User();
        user.setName("张三");
        user.setAge(18);
        userService.save(user);
        return "seata-two success.";
    }
}
