package com.onlineschool.service;

import com.onlineschool.models.AdditionalTasks;

public class AdditionalTasksService {

    public AdditionalTasks additionalTasksCreation(String nameAdditionalTasks, Integer ID,Integer lectureID) {
        return new AdditionalTasks(nameAdditionalTasks, ID, lectureID);
    }

    public static int id = 0;
    public int idTest = 0;

    public AdditionalTasksService() {
        id++;
        idTest++;
    }
}
