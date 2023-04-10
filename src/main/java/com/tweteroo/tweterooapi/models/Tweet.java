package com.tweteroo.tweterooapi.models;

import org.hibernate.validator.constraints.URL;

import com.tweteroo.tweterooapi.dto.TweetDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor

public class Tweet {

    public Tweet (TweetDTO req, String avatar) {
        this.username = req.username();
        this.text = req.tweet();
        this.avatar = avatar;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 30, nullable = false)
    private String username;
    
    @Column(length = 300, nullable = false)
    private String text;

    @URL
    @Column(nullable = false)
    private String avatar;

}
