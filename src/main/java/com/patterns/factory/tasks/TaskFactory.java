package com.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Driving task", "There", "Us");
            case PAINTING:
                return new PaintingTask("Painting task", "Blue", "Sky");
            case SHOPPING:
                return new ShoppingTask("Shopping task", "All", 30000);
            default:
                return null;
        }
    }
}