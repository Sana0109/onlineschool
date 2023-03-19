package com.onlineschool.repository;

import com.onlineschool.models.LevelLog;
import com.onlineschool.models.Log;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class LogRepository extends GenericRepository {

    public static void logAll() {

        ArrayList<Log> logStorage = new ArrayList<>();
        logStorage.add(new Log(LocalDateTime.now(), LevelLog.ERROR, "Name ", "You have a mistake",
                "ERROR"));
        logStorage.add(new Log(LocalDateTime.now(), LevelLog.WARNING, "Name ", "Unexpected action",
                "WARNING"));
        logStorage.add(new Log(LocalDateTime.now(), LevelLog.DEBUG, "Name ", "Method is working"));
        logStorage.forEach(System.out::println);

    }


    @Override
    public int getArray(int index) {
        return 0;
    }

    @Override
    public void remove(int index) {
        super.remove(index);
    }

    @Override
    public int size() {
        return super.size();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public Object get(int index) {
        return super.get(index);
    }

    @Override
    public void add(int index, Object element) {
        super.add(index, element);
    }

    @Override
    public void add(Object element) {
        super.add(element);
    }

}
