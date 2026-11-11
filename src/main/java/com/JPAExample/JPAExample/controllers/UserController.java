package com.JPAExample.JPAExample.controllers;

import com.JPAExample.JPAExample.entity.UserDetails;
import com.JPAExample.JPAExample.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/")
public class UserController {

    @Autowired
    UserDetailsService userDetailsService;

    @GetMapping(path = "/test-jpa")
    public UserDetails getUser() {
        UserDetails userDetails = new UserDetails("Ankit", "ak@gmail.com");

        userDetailsService.saveUser(userDetails);
        return userDetailsService.findByID(1L);

    }
}
