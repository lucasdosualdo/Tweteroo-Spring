# Tweteroo

Tweteroo is a minimalist version of Twitter, developed using Java, Spring Boot, and H2 database.

<img src="/src/main/resources/static/preview-pictures/picture-1.png" width="270" /> <img src="/src/main/resources/static/preview-pictures/picture-2.png" width="270" />

The application allows users to sign up with a username and a corresponding URL for a profile picture. Once registered, users can post tweets and interact with other users tweets.

## Features

### Sign-up
Users can create an account by providing a unique username and a URL corresponding to their profile picture.

### Posting Tweets
Registered users can post tweets, expressing their thoughts or sharing information. Each tweet has a character limit to keep messages concise.

### Homepage
The homepage displays the five most recent tweets, regardless of the user, using the GET /tweets route. Pagination is implemented to handle large numbers of tweets.

### User Profile and Tweets
Users can access and view all the tweets created by a specific user by using the GET /tweets/username route. This allows users to explore and follow the tweets of their favorite users.

## Main Stacks
- Java
- Spring-Boot
- H2 Database

## Link to Front-End
```bash
https://github.com/lucasdosualdo/Tweteroo-Frontend
```

## Installation
To run the Tweteroo application locally, follow the steps below:

1. Clone the repository: 
```bash
git clone https://github.com/lucasdosualdo/Tweteroo-Spring
```
2. Install the required dependencies.
3. Set up the H2 database and configure the connection in the application properties.
4. Build and run the application using your preferred Java development environment.
