package com.security.basic.controller;

import com.security.basic.dao.repo.UserRepository;
import com.security.basic.domain.User;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
public class TestDummyController {

    @Autowired
    UserRepository userRepository;
    @PostMapping("/add")
    public void addSomeDummyData() {
        User user =  null;
        for (int i = 0; i < 15; i++) {
            Date date = (i%2 == 0) ? new Date() : DateUtils.addDays(new Date(), -1);
            String status = (i%3 == 1) ? "pending" : "success";
            user = new User(String.valueOf(i),"sam"+i, date, status);
            userRepository.save(user);
        }
    }
}
