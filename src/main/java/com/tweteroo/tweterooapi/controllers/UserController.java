package com.tweteroo.tweterooapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.tweterooapi.dto.UserApplicationDTO;

import com.tweteroo.tweterooapi.models.UserApplication;
import com.tweteroo.tweterooapi.services.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/auth")
public class UserController {
    @Autowired
    private UserService service;
    
    @PostMapping("/sign-up")
    @ResponseStatus(value = HttpStatus.CREATED)
    public void create(@RequestBody @Valid UserApplicationDTO req) {
        
        service.create(new UserApplication(req));
    }
}
