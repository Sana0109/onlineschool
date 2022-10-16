package com.onlineschool.service;

import com.onlineschool.Homeworks;

public class HomeworksService {
    public Homeworks homeworksCreation() {
        return new Homeworks();
    }
    public static int id = 0;
    public int idTest = 0;

    public HomeworksService() {
        id++;
        idTest++;
    }
}
