package com.onlineschool.service;

import com.onlineschool.models.AdditionalTasks;
import com.onlineschool.models.Course;
import com.onlineschool.models.Teacher;

public class AdditionalTasksService {

    public AdditionalTasks additionalTasksCreation(String nameAdditionalTasks, Course courseID, Teacher teacher, String date) {
        return new AdditionalTasks(nameAdditionalTasks,courseID,teacher,date);
    }

    public static int id = 0;
    public int idTest = 0;

    public AdditionalTasksService() {
        id++;
        idTest++;
    }
}
