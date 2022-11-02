package com.onlineschool.models;

public class Lecture {


    public String nameLecture;
    public String secondNameTeacher;
    public String date;

    public String nameCourse;
    public String groupNumber;
    public long courseID;
    public  static int id = 0;
    public int idTest = 0;
    public  Lecture(String nameLecture,String nameCourse,String secondNameTeacher,String date,String groupNumber,long courseID) {

        this.nameLecture = nameLecture;
        this.nameCourse = nameCourse;
        this.secondNameTeacher = secondNameTeacher;
        this.date = date;
        this.groupNumber = groupNumber;
        this.courseID = courseID;

        id++;
        idTest++;
    }

    public Long getCourseID() {
        return courseID;
    }

    public void setCourseID(Long courseID) {
        this.courseID = courseID;
    }

    public Lecture() {



    }

    @Override
    public String toString() {
        return " Lecture - " +nameLecture +"\n Name Course - " +nameCourse +"\n Second Name Teacher - " +secondNameTeacher

        +"\n Data  " +date + "\n Group Number  " +groupNumber + "\n ID Course  " +courseID;
    }


}




