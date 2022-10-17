package com.onlineschool.service;

import com.onlineschool.models.Students;

public class StudentsService {
    public Students studentsCreation() {
        return new Students();
    }
    public static int id = 0;
    public int idTest = 0;

    public StudentsService() {
        id++;
        idTest++;
    }
}
