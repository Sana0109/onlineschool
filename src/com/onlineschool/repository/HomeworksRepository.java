package com.onlineschool.repository;

import com.onlineschool.models.Homeworks;

import java.util.Arrays;

public class HomeworksRepository {
    int BOXES = 10;
    Homeworks[] homework = new  Homeworks[BOXES];

    public Homeworks[] getHomework() {
        return homework;
    }

    public int getBOXES() {
        return BOXES;
    }

    @Override
    public String toString() {
        return "HomeworksRepository{" +
                "BOXES=" + BOXES +
                ", homework=" + Arrays.toString(homework) +
                '}';
    }
}
