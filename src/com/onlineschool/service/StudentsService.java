package com.onlineschool.service;

import com.onlineschool.models.Students;

public class StudentsService {
    public Students studentsCreation(String groupNumber,String secondName) {
        return new Students(groupNumber,secondName);
    }

    public static int id = 0;
    public int idTest = 0;

    public StudentsService() {
    id++;
    idTest++;}
}
