package org.dksoft.userservice.controller;

import org.dksoft.userservice.entity.User;
import org.dksoft.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /* eg. url->
        http://localhost:8080/users?page=0&size=2&sort=firstName */
    @GetMapping("users")
    public List<User> test(Pageable pageable) {
        return userService.getUsersWithPagination(pageable);
    }
}
