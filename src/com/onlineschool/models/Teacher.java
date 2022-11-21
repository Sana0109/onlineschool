package com.onlineschool.models;

public class Teacher extends Faculty {

    private String nameTeacher;
    private String secondNameTeacher;
    private Lecture nameLecture;
    private Course course;

    public Teacher(String secondNameTeacher, String nameTeacher, Lecture nameLecture, Course course) {
        super(1);
        this.course = course;
        this.secondNameTeacher = secondNameTeacher;
        this.nameTeacher = nameTeacher;
        this.nameLecture = nameLecture;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }


    public void setNameLecture(Lecture nameLecture) {
        this.nameLecture = nameLecture;
    }

    public String getSecondNameTeacher() {
        return secondNameTeacher;
    }

    public void setSecondNameTeacher(String secondNameTeacher) {
        this.secondNameTeacher = secondNameTeacher;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "secondNameTeacher='" + secondNameTeacher + '\'' +
                '}';
    }
}
