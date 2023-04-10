package com.tweteroo.tweterooapi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tweteroo.tweterooapi.models.Tweet;

@Repository
public interface TweetRepository extends JpaRepository <Tweet, Long>{
    Optional<List<Tweet>> findTweetsByUsername(String username);
}
