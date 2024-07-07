package com.training.example.service;

import com.training.example.entity.MyUser;
import com.training.example.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@Service
public class UserService {

    @Resource
    private UserRepository userRepository;

    public MyUser createUser(String name) {
        MyUser user = new MyUser();
        user.setName(name);
        user.setCreateTime(LocalDateTime.now());
        return userRepository.save(user);
    }
}