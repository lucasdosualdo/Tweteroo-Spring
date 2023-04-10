package com.tweteroo.tweterooapi.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.tweterooapi.dto.TweetDTO;
import com.tweteroo.tweterooapi.models.Tweet;
import com.tweteroo.tweterooapi.services.TweetService;
import com.tweteroo.tweterooapi.services.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/tweets")
public class TweetController {

    @Autowired
    private TweetService tweetService;
    @Autowired
    private UserService userService;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
      public void create (@RequestBody @Valid TweetDTO req) {
          String username = req.username();
          Optional<String> optionalAvatar = userService.getAvatarByUsername(username);
          String avatar = optionalAvatar.orElse(null);
         tweetService.create(new Tweet(req, avatar));
      }  
}
