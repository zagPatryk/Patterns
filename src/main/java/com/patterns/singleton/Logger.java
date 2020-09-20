package com.patterns.singleton;

public class Logger {
    private static Logger logger = null;
    private String lastLog = "";

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public static Logger getInstance() {
        if (logger == null) {
            synchronized(Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public String getLastLog() {
        return lastLog;
    }
}