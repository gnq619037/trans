package com.gnq.trans.controller;

import com.gnq.trans.entites.User;
import com.gnq.trans.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: guonanqing
 * @desc:
 * @date:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    public Object addUser(@RequestBody User user){
        userService.addUser(user);
        return "success";
    }
}
