package com.onlineschool.repository;

import com.onlineschool.models.LevelLog;
import com.onlineschool.models.Log;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LogRepository  extends GenericRepository{
    public  static  void logAll(){
        List<Log> logArray = new ArrayList<>();
        logArray.add(new Log(LocalDateTime.now(), LevelLog.ERROR,"name","is true"));
        System.out.println(logArray);
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
