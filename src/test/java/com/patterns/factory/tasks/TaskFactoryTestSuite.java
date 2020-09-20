package com.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("Driving task", task.getTaskName());
    }

    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("Shopping task", task.getTaskName());
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("Painting task", task.getTaskName());
    }

    @Test
    public void testExecuteTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.makeTask(TaskFactory.DRIVING);
        task.executeTask();
        //Then
        Assert.assertTrue(task.isTaskExecuted());
    }

    @Test
    public void testNotExecutedTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertFalse(task.isTaskExecuted());
    }
}
