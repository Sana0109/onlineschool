package com.onlineschool.service;

import com.onlineschool.models.Lecture;

public class LectureService {

    public static Lecture lectureCreation(String nameLecture, String nameCourse, String secondNameTeacher, String date, String groupNumber, Long ID) {
        return new Lecture(nameLecture, nameCourse, secondNameTeacher, date, groupNumber, ID);
    }

}