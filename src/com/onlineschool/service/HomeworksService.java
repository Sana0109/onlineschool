package com.onlineschool.service;

import com.onlineschool.models.Course;
import com.onlineschool.models.Homeworks;
import com.onlineschool.models.Teacher;

public class HomeworksService {
    public Homeworks homeworksCreation(String nameHomeworks, Teacher teacher, Course course) {
        return new Homeworks(nameHomeworks,teacher,course);
    }

    public static int id = 0;
    public int idTest = 0;

    public HomeworksService() {
        id++;
        idTest++;
    }
}
