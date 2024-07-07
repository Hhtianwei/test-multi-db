package com.training.example.web;

import com.training.example.entity.MyUser;
import com.training.example.service.UserService;
import com.training.tian.util.RandomName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public MyUser createUser(@RequestParam String name) {
        return userService.createUser(name);
    }


    @GetMapping
    public String createU() {
        String randomName = RandomName.getRandomName();
        userService.createUser(randomName);
        return randomName;
    }
}