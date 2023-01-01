package com.onlineschool.repository;

import com.onlineschool.models.Homeworks;

import java.util.Arrays;

public class HomeworksRepository extends GenericRepository {
    private final int BOXES = 10;
    Homeworks[] homework = new Homeworks[BOXES];

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

    public Homeworks[] getHomework() {
        return homework;
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
                ", homework=" + Arrays.toString(homework) +
                '}';
    }
}
