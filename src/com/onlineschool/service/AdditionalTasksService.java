package com.onlineschool.service;

import com.onlineschool.AdditionalTasks;

public class AdditionalTasksService {

    public AdditionalTasks additionalTasksCreation() {
        return new AdditionalTasks();
    }

    public static int id = 0;
    public int idTest = 0;

    public AdditionalTasksService() {
        id++;
        idTest++;
    }
}
