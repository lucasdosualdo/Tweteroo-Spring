package com.tweteroo.tweterooapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.tweteroo.tweterooapi.models.Tweet;
import com.tweteroo.tweterooapi.repository.TweetRepository;
import org.springframework.data.domain.Pageable;

@Service
public class TweetService {

    @Autowired
    private TweetRepository repository;

    public void create(Tweet data) {
        repository.save(data);
    }

    public List<Tweet> findAll(int page) {
        int tweetPerPage = 5;
        int currentPage = page - 1;
        Pageable firstPageWithTwoElements = PageRequest.of(currentPage, tweetPerPage, Sort.by("id").descending());
        return repository.findAll(firstPageWithTwoElements).getContent();
    }

    public List<Tweet> findAllByUser(String username) {
        Optional<List<Tweet>> optionalTweetsByUser = repository.findTweetsByUsername(username);
        List<Tweet> tweetsByUser = optionalTweetsByUser.orElse(null);
        return tweetsByUser;
    }
}
