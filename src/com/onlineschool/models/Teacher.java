package com.onlineschool.models;

public class Teacher {

    public String nameTeacher;
    public String secondNameTeacher;
    private Lecture nameLecture;

    public Teacher(String secondNameTeacher,String nameTeacher) {
        this.secondNameTeacher = secondNameTeacher;
        this.nameTeacher = nameTeacher;
    }

}
