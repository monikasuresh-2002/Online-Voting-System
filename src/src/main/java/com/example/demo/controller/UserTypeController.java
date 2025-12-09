package com.example.demo.controller;

import com.example.demo.entity.UserType;
import com.example.demo.service.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user-types")
public class UserTypeController {

    @Autowired
    private UserTypeService userTypeService;

    @GetMapping
    public List<UserType> getAllUserTypes() {
        return userTypeService.getAllUserTypes();
    }

    @GetMapping("/{id}")
    public Optional<UserType> getUserTypeById(@PathVariable int id) {
        return userTypeService.getUserTypeById(id);
    }

    @PostMapping
    public UserType saveUserType(@RequestBody UserType userType) {
        return userTypeService.saveUserType(userType);
    }

    @DeleteMapping("/{id}")
    public void deleteUserType(@PathVariable int id) {
        userTypeService.deleteUserType(id);
    }
}
