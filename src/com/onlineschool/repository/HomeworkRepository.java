package com.onlineschool.repository;

import com.onlineschool.models.AdditionalTasks;
import com.onlineschool.models.Homework;


import java.util.*;


public class HomeworkRepository extends GenericRepository {


    public static void homeworkMap() {
        HashMap<Homework, Homework> homeworkMap = new HashMap<>();
        homeworkMap.put(new Homework(2, "Name Homework 2"), new Homework(2, "Name Homework 2"));
        homeworkMap.put(new Homework(1, "Name Homework 1"), new Homework(1, "Name Homework 1"));
        homeworkMap.put(new Homework(3, "Name Homework 3"), new Homework(3, "Name Homework 3"));
        for (Map.Entry<Homework, Homework> item : homeworkMap.entrySet()) {
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


    @Override
    public int getArray(int index) {
        return 0;
    }

    @Override
    public String toString() {
        return "HomeworksRepository{" +

                ", homeworks =" +
                '}';
    }
}
