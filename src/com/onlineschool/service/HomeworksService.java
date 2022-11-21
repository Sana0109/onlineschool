package com.onlineschool.service;

import com.onlineschool.models.Course;
import com.onlineschool.models.Homeworks;

public class HomeworksService {
    public Homeworks homeworksCreation(String nameHomeworks,Course course) {
        return new Homeworks(nameHomeworks,course);
    }

    public static int id = 0;
    public int idTest = 0;

    public HomeworksService() {
        id++;
        idTest++;
    }
}
