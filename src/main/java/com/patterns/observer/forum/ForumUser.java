package com.patterns.observer.forum;

public class ForumUser implements Observer {

    private final String userName;
    private int updateCount;

    public ForumUser(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(ForumTopic forumTopic) {
        System.out.println(userName + " " + forumTopic.getName() + " " + forumTopic.getMessages()
                .get(forumTopic.getMessages().size()-1));
        updateCount++;
    }

    public String getUserName() {
        return userName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
