package com.onlineschool.repository;

import com.onlineschool.models.AdditionalTasks;

import java.util.Arrays;


public class AdditionalTasksRepository extends FacultyRepository {
    int BOXES = 10;
    AdditionalTasks[] additionalTasks = new AdditionalTasks[BOXES];

    public int getBOXES() {
        return BOXES;
    }

    public AdditionalTasks[] getAdditionalTasks() {
        return additionalTasks;
    }

    @Override
    public String toString() {
        return "AdditionalTasksRepository{" +
                "BOXES=" + BOXES +
                ", additionalTasks=" + Arrays.toString(additionalTasks) +
                '}';
    }
}
