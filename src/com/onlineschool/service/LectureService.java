package com.onlineschool.service;

import com.onlineschool.models.Course;
import com.onlineschool.models.Lecture;
import com.onlineschool.models.Teacher;

public class LectureService {

    public Lecture lectureCreation(String nameLecture, Course course, Teacher teacher, String date) {
        return new Lecture(nameLecture,course,teacher,date);
    }


}
