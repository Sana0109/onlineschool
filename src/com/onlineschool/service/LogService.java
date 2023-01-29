package com.onlineschool.service;

import com.onlineschool.models.LevelLog;
import com.onlineschool.models.Log;

import java.time.LocalDateTime;

public class LogService {
    public static Log logCreation(LocalDateTime localDateTime, LevelLog level, String name, String message) {
        return new Log(localDateTime, level, name, message);
    }

    @Override
    public String toString() {
        return "LogService{}";
    }
}
