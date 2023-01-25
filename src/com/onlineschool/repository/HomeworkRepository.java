package com.onlineschool.repository;

import com.onlineschool.models.Homework;



import java.util.Arrays;

public class HomeworkRepository extends GenericRepository {
    private final int BOXES = 10;
    Homework[] homeworks = new Homework[BOXES];
  /*  public final GenericRepository<Homework> homeworksArray = new GenericRepository<>(new Homework[]{
            new Homework(1,1,"Name Homeworks "),
            new Homework(2,2,"Name Homeworks "),
            new Homework(3,3,"Name Homeworks "),null,null

    }) {
        @Override
        public int getArray(int index) {
            return 0;
        }
    };*/
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

    public int getBOXES() {
        return BOXES;
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
