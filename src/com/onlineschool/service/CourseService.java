package com.onlineschool.service;

import com.onlineschool.Course;

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
