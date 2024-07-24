package com.dio.web.api.controller;

import com.dio.web.api.model.User;
import com.dio.web.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/fetch")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/get/{username}")
    public User getOne(@PathVariable("username") String username) {
        return userRepository.findByUsername(username);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id) {
        userRepository.deleteById(id);
    }

    @PostMapping("/create")
    public void saveUser(@RequestBody User user) {
        userRepository.save(user);
    }

    @PutMapping("/update")
    public void updateUser(@RequestBody User user) {
        userRepository.save(user);
    }
}
