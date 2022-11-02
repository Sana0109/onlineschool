package com.onlineschool.models;

public class Course {

    public String nameCourse;
    public String number;
    public String secondNameTeacher;
    public String nameLecture;
    public String groupNumber;
   public long ID;


    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public Course(long ID, String nameCourse, String secondNameTeacher, String groupNumber,String nameLecture) {
        ID++;
        this.ID = ID;
        this.nameCourse = nameCourse;
        this.secondNameTeacher = secondNameTeacher;
        this.groupNumber = groupNumber;
        this.nameLecture = nameLecture;
    }


    @Override
    public String toString() {
        return "Course\n" +
                nameCourse + secondNameTeacher
                + groupNumber + "\n ID Course " + ID + "\n"+"Name Lecture" +nameLecture +"\n";
    }

}




