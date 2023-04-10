package com.tweteroo.tweterooapi.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweteroo.tweterooapi.models.UserApplication;
import com.tweteroo.tweterooapi.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public void create(UserApplication data) {
        repository.save(data);
    }

     public Optional<String> getAvatarByUsername(String username) {
        Optional<UserApplication> user = repository.findByUsername(username);
        return user.map(UserApplication::getAvatar);
    }
}
