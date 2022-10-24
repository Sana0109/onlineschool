package com.onlineschool.models;

public class Lecture {


    private String nameLecture;
    private Teacher teacher;
    private String date;
    public Course course;

    public static int id = 0;
    public int idTest = 0;

    public Lecture(String nameLecture, Course course, Teacher teacher, String date) {
        this.nameLecture = nameLecture;
        this.course = course;
        this.teacher = teacher;
        this.date = date;
        id++;
        idTest++;
    }


}





