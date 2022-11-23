package com.jw.seataone.controller;


import com.jw.seataone.pojo.User;
import com.jw.seataone.service.impl.UserServiceImpl;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 前端控制器
 *
 * @author javertWong
 * @version 1.0.0
 * @date 2022-11-21
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/insert")
    @GlobalTransactional
    public String insert() {
        User user = new User();
        user.setName("张三");
        user.setAge(180);
        userService.save(user);
        ResponseEntity<String> responseEntity1 = restTemplate.getForEntity("http://localhost:8081/user/insert", String.class);
        System.out.println(responseEntity1.getBody());
        ResponseEntity<String> responseEntity2 = restTemplate.getForEntity("http://localhost:8082/user/insert", String.class);
        System.out.println(responseEntity2.getBody());
        return "success.";
    }
}
