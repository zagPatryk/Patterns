package com.patterns.strategy.social;


import com.patterns.strategy.social.publisher.SocialPublisher;

public class User {
    private String name;
    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    public boolean sharePost() {
        System.out.println(socialPublisher.share());
        return true;
    }
}
