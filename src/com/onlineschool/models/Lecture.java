package com.onlineschool.models;


import java.util.Arrays;

public class Lecture {
    private String nameLecture;
    private int courseID;
    private Homework[] homeworks;
    private Person personID;

    public Lecture(String nameLecture, int courseID, Homework[] homeworks, Person personID) {
        this.nameLecture = nameLecture;
        this.courseID = courseID;
        this.homeworks = homeworks;
        this.personID = personID;
    }

    public Lecture(int courseID) {

    }

    public String getNameLecture() {
        return nameLecture;
    }

    public void setNameLecture(String nameLecture) {
        this.nameLecture = nameLecture;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }


    public Person getPersonID() {
        return personID;
    }

    public void setPersonID(Person personID) {
        this.personID = personID;
    }

    @Override
    public String toString() {
        return " Name Lecture " + getNameLecture() + "\n Course ID " + getCourseID() + "\n Homeworks ID " + Arrays.toString(homeworks) +
                "\n Person \n" ;

    }
}

