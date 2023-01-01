package com.onlineschool.models;

public class Course {

    private int ID;
    private String nameCourse;
    private  String nameLecture;


    public String getNameLecture() {
        return nameLecture;
    }

    public void setNameLecture(String nameLecture) {
        this.nameLecture = nameLecture;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    @Override
    public String toString() {
        return "Course:\n " +
               "Name Course " +getNameCourse() + "\n "  + "Name Lecture "
                +getNameLecture() + "\n ID Course " + getID() + "\n " + Role.TEACHER;
    }

}




