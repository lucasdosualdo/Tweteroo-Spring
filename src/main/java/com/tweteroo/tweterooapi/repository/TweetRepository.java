package com.tweteroo.tweterooapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tweteroo.tweterooapi.models.Tweet;

@Repository
public interface TweetRepository extends JpaRepository <Tweet, Long>{
    
}
