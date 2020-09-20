package com.patterns.strategy.social;

import com.patterns.strategy.social.publisher.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;


public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        YGeneration userY = new YGeneration("yGen");
        ZGeneration userZ = new ZGeneration("userZ");
        Millenials userM = new Millenials("userM");

        //When
        String userYPost = userY.socialPublisher.share();
        String userZPost = userZ.socialPublisher.share();
        String userMPost = userM.socialPublisher.share();

        //Then
        Assert.assertEquals("Facebook", userYPost);
        Assert.assertTrue(userY.sharePost());

        Assert.assertEquals("Snapchat", userZPost);
        Assert.assertTrue(userZ.sharePost());

        Assert.assertEquals("Twitter", userMPost);
        Assert.assertTrue(userM.sharePost());
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        YGeneration userIndividual = new YGeneration("userIndividualY");

        //When
        userIndividual.setSocialPublisher(new TwitterPublisher());
        String userIndividualPost = userIndividual.socialPublisher.share();

        //Then
        Assert.assertEquals("Twitter", userIndividualPost);
        Assert.assertTrue(userIndividual.sharePost());
    }
}
