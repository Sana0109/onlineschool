package com.onlineschool.repository;

import com.onlineschool.models.Homework;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class HomeworkRepository extends GenericRepository {
    private final int BOXES = 10;
    Homework[] homeworks = new Homework[BOXES];

    public static void homeworkMap() {
        HashMap<Homework[], Homework[]> homeworkMap1 = new HashMap<>();
        homeworkMap1.put(new Homework[]{new Homework(2, "Name Homework 2")}, new Homework[]{new Homework(2, "Name Homework 2")});
        homeworkMap1.put(new Homework[]{new Homework(1, "Name Homework 1")}, new Homework[]{new Homework(1, "Name Homework 1")});
        homeworkMap1.put(new Homework[]{new Homework(3, "Name Homework 3")}, new Homework[]{new Homework(3, "Name Homework 3")});
        for (Map.Entry<Homework[], Homework[]> item : homeworkMap1.entrySet()) {
            System.out.println(Arrays.toString(item.getKey()));
        }
    }

    public static void printData(HashMap<Homework[], Homework[]> homeworkMap1) {
        for (Map.Entry<Homework[], Homework[]> item : homeworkMap1.entrySet()) {
            System.out.println(item.getKey());
        }
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
    public void add(Object element) {
        super.add(element);
    }

    @Override
    public void add(int index, Object element) {
        super.add(index, element);
    }


    @Override
    public void remove(int index) {
        super.remove(index);
    }

    public Homework[] getHomework() {
        return homeworks;
    }

    @Override
    public int getArray(int index) {
        return 0;
    }

    @Override
    public String toString() {
        return "HomeworksRepository{" +
                "BOXES=" + BOXES +
                ", homeworks =" +
                '}';
    }
}
