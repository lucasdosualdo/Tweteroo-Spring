package com.tweteroo.tweterooapi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.tweterooapi.dto.TweetDTO;
import com.tweteroo.tweterooapi.models.Tweet;
import com.tweteroo.tweterooapi.services.TweetService;
import com.tweteroo.tweterooapi.services.UserService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;

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

    @GetMapping
    public List<Tweet> getTweets(@RequestParam @Min(1) int page) {
        return tweetService.findAll(page);
    }
    
    @GetMapping("/{username}")
    public List<Tweet> getUserTweets(@PathVariable String username) {
        return tweetService.findAllByUser(username);
    }
}
