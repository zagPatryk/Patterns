package com.patterns.observer.forum;

import com.patterns.observer.forum.topic.JavaHelpForumTopic;
import com.patterns.observer.forum.topic.JavaToolsForumTopic;
import org.junit.Test;

import static org.junit.Assert.*;

public class ForumUserTestSuite {

    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser user1 = new ForumUser("user1");
        ForumUser user2 = new ForumUser("user2");
        ForumUser user3 = new ForumUser("user3");
        javaHelpForum.registerObserver(user1);
        javaHelpForum.registerObserver(user2);
        javaToolsForum.registerObserver(user2);
        //When
        javaHelpForum.addPost("post1H");
        javaHelpForum.addPost("post2H");
        javaToolsForum.addPost("post1T");
        //Then
        assertEquals(2, user1.getUpdateCount());
        assertEquals(3, user2.getUpdateCount());
        assertEquals(0, user3.getUpdateCount());
    }
}