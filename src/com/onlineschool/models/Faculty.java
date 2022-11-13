package com.onlineschool.models;

public class Faculty {
    private Course nameCourse;
    private Lecture nameLecture;
    private int courseID;
    private Students groupNumber;

    public Faculty(int courseID,Course nameCourse,Lecture nameLecture,Students groupNumber) {
        this.courseID = courseID;
        this.nameCourse = nameCourse;
        this.nameLecture = nameLecture;
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

    public int getCourseID() {

        return courseID;
    }



    @Override
    public String toString() {
        return "Faculty{" +
                "nameCourse=" + nameCourse +
                ", nameLecture=" + nameLecture +
                ", courseID=" + courseID +
                ", groupNumber=" + groupNumber +
                '}';
    }
}

