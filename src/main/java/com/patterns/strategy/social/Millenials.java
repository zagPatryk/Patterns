package com.patterns.strategy.social;


import com.patterns.strategy.social.publisher.TwitterPublisher;

public class Millenials extends User {
    public Millenials(String name) {
        super(name);
        this.socialPublisher = new TwitterPublisher();
    }
}
