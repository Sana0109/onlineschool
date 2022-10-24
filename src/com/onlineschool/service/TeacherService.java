package com.onlineschool.service;

import com.onlineschool.models.Teacher;

public class TeacherService {
    public Teacher teacherCreation(String secondNameTeacher) {

        return new Teacher(secondNameTeacher);
    }

    public static int id = 0;
    public int idTest = 0;

    public TeacherService() {
        id++;
        idTest++;
    }
}
