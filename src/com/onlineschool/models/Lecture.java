package com.onlineschool.models;



public class Lecture extends Faculty {
    private int courseID;
    private String nameCourse;
    private String secondNameTeacher;
    private String nameLecture;

    public Lecture(int courseID) {
        super(1);
    }

    public Lecture(int courseID, String nameLecture, String nameCourse, String secondNameTeacher) {
        super(1);


        this.secondNameTeacher = secondNameTeacher;
        this.nameLecture = nameLecture;
        this.nameCourse = nameCourse;
        this.courseID = courseID;


    }

    public String getSecondNameTeacher() {
        return secondNameTeacher;
    }

    public void setSecondNameTeacher(String secondNameTeacher) {
        this.secondNameTeacher = secondNameTeacher;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getNameLecture() {
        return nameLecture;
    }

    public void setNameLecture(String nameLecture) {
        this.nameLecture = nameLecture;
    }


    @Override
    public String toString() {
        return  " Course ID " + courseID+"\n Name Lecture "+nameLecture +"\n Name Course "+nameCourse+
                "\n Second Name Teacher " +secondNameTeacher;

    }


}

