package com.g1335333249.controller;

import com.g1335333249.entity.User;
import com.g1335333249.model.UserLoginDTO;
import com.g1335333249.service.UserServiceDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author guanpeng
 * @date 2019-06-24 18:06
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceDetail userServiceDetail;

    @PostMapping("/register")
    public User postUser(@RequestParam("username") String username,
                         @RequestParam("password") String password) {
        return userServiceDetail.insertUser(username, password);
    }

    @PostMapping("/login")
    public UserLoginDTO login(@RequestParam("username") String username,
                              @RequestParam("password") String password) {
        return userServiceDetail.login(username,password);
    }

    @RequestMapping(value = "/foo", method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String getFoo() {
        return "i'm foo, " + UUID.randomUUID().toString();
    }
}
