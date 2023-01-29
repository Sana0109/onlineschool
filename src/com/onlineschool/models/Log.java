package com.onlineschool.models;

public class Log {
    private String name;
    private LevelLog level;
    private String message;
    private Integer localDateTime;
    private String stackTrace;

    public Log(String name, LevelLog level, String message, Integer localDateTime, String stackTrace) {
        this.name = name;
        this.level = level;
        this.message = message;
        this.localDateTime = localDateTime;
        this.stackTrace = stackTrace;
    }

    public Log(Integer localDateTime,LevelLog level,String name,String message) {
        this.localDateTime = localDateTime;
        this.level = level;
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LevelLog getLevel() {
        return level;
    }

    public void setLevel(LevelLog level) {
        this.level = level;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(Integer localDateTime) {
        this.localDateTime = localDateTime;
    }

    public String getStackTrace() {
        return stackTrace;
    }

    public void setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
    }

    @Override
    public String toString() {
        return "Log{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", message='" + message + '\'' +
                ", localDateTime=" + localDateTime +
                ", stackTrace='" + stackTrace + '\'' +
                '}';
    }
}
