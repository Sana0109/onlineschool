package com.onlineschool.service;

import com.onlineschool.models.Teacher;

public class TeacherService {
    public Teacher teacherCreation(String secondNameTeacher,String nameTeacher) {

        return new Teacher(secondNameTeacher,nameTeacher);
    }
    public static int id = 0;
    public int idTest = 0;

    public TeacherService() {

        id++;
        idTest++;
    }

}
