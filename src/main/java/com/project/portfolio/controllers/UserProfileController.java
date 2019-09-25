package com.project.portfolio.controllers;

import com.project.portfolio.models.User;
import com.project.portfolio.models.UserProfile;
import com.project.portfolio.services.UserProfileService;
import com.project.portfolio.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value ="/profiles")
@CrossOrigin
public class UserProfileController {

    private UserProfileService service;

    @Autowired
    public UserProfileController(UserProfileService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Iterable<UserProfile>> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<UserProfile> createUser(@RequestBody UserProfile profile){
        return new ResponseEntity<>(service.create(profile), HttpStatus.CREATED);
    }

}