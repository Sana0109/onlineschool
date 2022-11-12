package com.onlineschool.models;

import com.onlineschool.models.Course;
import com.onlineschool.models.Lecture;
import com.onlineschool.models.Students;

public class Faculty {
    private Course nameCourse;
    private Lecture nameLecture;
    private int courseID;
    private Students groupNumber;

    public Faculty(Students groupNumber) {
        this.groupNumber = groupNumber;
    }

    public Faculty(int courseID) {
        this.courseID = courseID;
    }

    public Faculty(Lecture nameLecture) {
        this.nameLecture = nameLecture;
    }

    public Faculty(Course nameCourse) {
        this.nameCourse = nameCourse;
    }

}

