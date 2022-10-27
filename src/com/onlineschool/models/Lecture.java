package com.onlineschool.models;

public class Lecture {


    public String nameLecture;
    private String secondNameTeacher;
    private String date;
    public String nameCourse;
    public String groupNumber;
    public  static int id = 0;
    public int idTest = 0;
    public  Lecture(String nameLecture,String nameCourse,String secondNameTeacher,String date,String groupNumber) {
        this.nameLecture = nameLecture;
        this.nameCourse = nameCourse;
        this.secondNameTeacher = secondNameTeacher;
        this.date = date;
        this.groupNumber = groupNumber;
        id++;
        idTest++;
    }

    public Lecture() {

    }

    @Override
    public String toString() {
        return " Lecture - " +nameLecture +"\n Name Course - "+nameCourse+"\n Second Name Teacher - " +secondNameTeacher
        +"\n Data  " +date+ "\n Group Number  " +groupNumber;
    }
}




