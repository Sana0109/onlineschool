package com.onlineschool.models;

public class Teacher {

    private String nameTeacher;
    private String secondNameTeacher;
    private Lecture nameLecture;

    public Teacher(String secondNameTeacher,String nameTeacher) {
        this.secondNameTeacher = secondNameTeacher;
        this.nameTeacher = nameTeacher;
    }

}
