package com.patterns.observer.homework;

import com.patterns.observer.homework.Homework;
import com.patterns.observer.homework.Observer;

public class Mentor implements Observer {

    private final String userName;
    private int updateCount;

    public Mentor(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(Homework homework) {
        System.out.println(userName + " " + homework.getName() + " " + homework.getTasks()
                .get(homework.getTasks().size()-1));
        updateCount++;
    }

    public String getUserName() {
        return userName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
