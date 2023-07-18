package com.example.demo.controller;

import com.example.demo.DTO.UserRegDTO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/customer")
public class UserController {

    @Autowired
    private UserService userService;
    @PutMapping(path = "/reg-user")
    public String regUser(@RequestBody UserRegDTO userRegDTO){
        String msg = userService.userReg(userRegDTO);
        return " ";
    }
}
