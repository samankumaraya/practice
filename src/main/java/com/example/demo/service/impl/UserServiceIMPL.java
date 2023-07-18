package com.example.demo.service.impl;

import com.example.demo.DTO.UserRegDTO;
import com.example.demo.Entity.UserEntity;
import com.example.demo.repo.UserRepo;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceIMPL implements UserService {
   @Autowired
   private UserRepo userRepo;

    @Override
    public String userReg(UserRegDTO userRegDTO) {
        if(!userRepo.existsByEmail(userRegDTO.getEmail())){
            //convert DTO--> Entity
            UserEntity user = new UserEntity(
                    userRegDTO.getUserName(),
                    userRegDTO.getEmail()
            );
            userRepo.save(user);
            return "user save successfully";
        }else{
            return "user is already registered";
        }

    }
}
