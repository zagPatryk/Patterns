package com.patterns.strategy.social;

import com.patterns.strategy.social.publisher.FacebookPublisher;

public class YGeneration extends User {
    public YGeneration(String name) {
        super(name);
        this.socialPublisher = new FacebookPublisher();
    }
}
