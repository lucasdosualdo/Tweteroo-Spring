package com.tweteroo.tweterooapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweteroo.tweterooapi.models.Tweet;
import com.tweteroo.tweterooapi.repository.TweetRepository;

@Service
public class TweetService {

    @Autowired
    private TweetRepository repository;

    public void create(Tweet data) {
        repository.save(data);
    }
    
}
