package com.onlineschool.service;

import com.onlineschool.models.Course;
import com.onlineschool.models.Students;

public class StudentsService {
    public Students studentsCreation(String groupNumber, String secondName, String name, Course course) {
        return new Students(groupNumber,secondName,name,course);
    }

    public static int id = 0;
    public int idTest = 0;

    public StudentsService() {
    id++;
    idTest++;}
}
