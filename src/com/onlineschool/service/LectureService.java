package com.onlineschool.service;

import com.onlineschool.models.Lecture;
import com.onlineschool.models.Teacher;

public class LectureService {
    public static int id = 0;
    public int idTest = 0;

    public LectureService() {
        id++;
        idTest++;
    }



    public static Lecture lectureCreation(String nameLecture, String nameCourse, String secondNameTeacher, String date, String groupNumber, Long ID) {
        return new Lecture(nameLecture, nameCourse, secondNameTeacher, date, groupNumber, ID);

    }

}