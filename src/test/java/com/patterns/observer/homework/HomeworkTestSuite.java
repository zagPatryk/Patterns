package com.patterns.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class HomeworkTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Homework homework1 = new Homework("h1");
        Homework homework2 = new Homework("h2");
        Homework homework3 = new Homework("h3");
        Mentor mentor1 = new Mentor("m1");
        Mentor mentor2 = new Mentor("m2");
        homework1.registerObserver(mentor1);
        homework2.registerObserver(mentor1);
        homework3.registerObserver(mentor1);
        homework2.registerObserver(mentor2);
        //When
        homework1.addTask("task1");
        homework1.addTask("task2");
        homework2.addTask("task3");
        homework3.addTask("task4");
        //Then
        assertEquals(4, mentor1.getUpdateCount());
        assertEquals(1, mentor2.getUpdateCount());
    }


    /*
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
     */

}