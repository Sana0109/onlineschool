package com.onlineschool.models;

public class Course {

    private String nameCourse;
    private String secondNameTeacher;
    private String nameLecture;
    private String groupNumber;
    private   int ID;




    public Course(int ID, String nameCourse, String secondNameTeacher, String groupNumber,String nameLecture) {
        ID++;
        this.ID = ID;
        this.nameCourse = nameCourse;
        this.secondNameTeacher = secondNameTeacher;
        this.groupNumber = groupNumber;
        this.nameLecture = nameLecture;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Course\n " +
                nameCourse +"\n "+ secondNameTeacher
                +"\n "+ groupNumber  + "\n " +nameLecture+ "\n ID Course "+ID;
    }

}




