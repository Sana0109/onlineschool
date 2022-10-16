package com.onlineschool.service;

import com.onlineschool.Teacher;

public class TeacherService {
    public Teacher teacherCreation() {
        return new Teacher();
    }
    public static int id = 0;
    public int idTest = 0;

    public TeacherService() {
        id++;
        idTest++;
    }

}
