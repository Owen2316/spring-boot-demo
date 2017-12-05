package com.spring.demo.controller;

import com.spring.demo.model.User;
import com.spring.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping()
    public List<User> userList(){
        return userRepository.findAll();
    }

    @PostMapping()
    public User addUser(@Valid User user, BindingResult bindingResult ){

        if(bindingResult.hasErrors()){
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
        }
        return null;

    }
}
