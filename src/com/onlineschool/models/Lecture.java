package com.onlineschool.models;

import com.onlineschool.repository.LectureRepository;

public class Lecture {
    private int courseID;
    private String nameCourse;
    private String secondNameTeacher;
    private String nameLecture;

    public Lecture(int courseID) {
        this.courseID = courseID;
    }

    public Lecture(int courseID, String nameLecture, String nameCourse, String secondNameTeacher) {


        this.secondNameTeacher = secondNameTeacher;
        this.nameLecture = nameLecture;
        this.nameCourse = nameCourse;
        this.courseID = courseID;


    }

    public String getSecondNameTeacher() {
        return secondNameTeacher;
    }

    public void setSecondNameTeacher(String secondNameTeacher) {
        this.secondNameTeacher = secondNameTeacher;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getNameLecture() {
        return nameLecture;
    }

    public void setNameLecture(String nameLecture) {
        this.nameLecture = nameLecture;
    }

    @Override
    public String toString() {
        return  " Course ID " + courseID;

    }


}

