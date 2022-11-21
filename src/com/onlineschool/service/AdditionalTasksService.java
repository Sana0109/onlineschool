package com.onlineschool.service;

import com.onlineschool.models.AdditionalTasks;

public class AdditionalTasksService {

    public AdditionalTasks additionalTasksCreation(String nameAdditionalTasks, int courseID,String date) {
        return new AdditionalTasks(nameAdditionalTasks,courseID,date);
    }

    public static int id = 0;
    public int idTest = 0;

    public AdditionalTasksService() {
        id++;
        idTest++;
    }
}
