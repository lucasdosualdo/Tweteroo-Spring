package com.tweteroo.tweterooapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweteroo.tweterooapi.models.User;
import com.tweteroo.tweterooapi.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public void create(User data) {
        repository.save(data);
    }
    
}
