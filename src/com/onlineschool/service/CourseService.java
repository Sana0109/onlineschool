package com.onlineschool.service;

import com.onlineschool.models.AdditionalTasks;
import com.onlineschool.models.Course;
import com.onlineschool.models.Teacher;

public class CourseService {
    public Course courseCreation() {
        return new Course();
    }

    public static int id = 0;

    public int idTest = 0;

    public CourseService() {
        id++;
        idTest++;
    }

}

