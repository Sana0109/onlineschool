package com.onlineschool.service;

import com.onlineschool.models.Course;
import com.onlineschool.models.Lecture;
import com.onlineschool.models.Teacher;

public class TeacherService {

    public static int id = 0;
    public int idTest = 0;

    public TeacherService() {
        id++;
        idTest++;
    }

    public static Teacher teacherCreation(String secondNameTeacher, String nameTeacher, Lecture nameLecture, Course course) {
        return new Teacher(secondNameTeacher,nameTeacher,nameLecture,course);
    }
}
