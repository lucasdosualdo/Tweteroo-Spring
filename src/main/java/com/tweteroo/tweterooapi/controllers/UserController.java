package com.tweteroo.tweterooapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.tweterooapi.dto.UserDTO;
import com.tweteroo.tweterooapi.models.User;
import com.tweteroo.tweterooapi.services.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/sign-up")
public class UserController {

    @Autowired
    private UserService service;
    
    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void create(@RequestBody @Valid UserDTO req) {
        service.create(new User(req));
    }
}
