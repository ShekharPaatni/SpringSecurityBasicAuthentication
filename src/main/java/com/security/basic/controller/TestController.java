package com.security.basic.controller;

import com.security.basic.dao.repo.UserRepository;
import com.security.basic.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/testResponse")
    public String test() {
        List<User> users = userRepository.find("pending");
        return "hello world";
    }

    @GetMapping("/listUser")
    public List<User> getList() {
        return userRepository.findAll();
    }
}
