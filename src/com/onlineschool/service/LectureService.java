package com.onlineschool.service;

import com.onlineschool.models.Course;
import com.onlineschool.models.Lecture;
import com.onlineschool.models.Teacher;

public class LectureService {

    public Lecture lectureCreation() {
        return new Lecture();
    }


    public static int id = 0;
    public int idTest = 0;

    public LectureService() {
        id++;
        idTest++;
    }

}
