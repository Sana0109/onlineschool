package com.onlineschool.models;

public class AdditionalTasks extends Faculty {

    private String nameAdditionalTasks;
    private String date;
    private Teacher teacher;
    private int courseID;



    public AdditionalTasks(String nameAdditionalTasks, int courseID, Teacher teacher, String date) {
        super(1);
        this.nameAdditionalTasks = nameAdditionalTasks;
        this.courseID = courseID;
        this.teacher = teacher;
        this.date = date;

    }

    public int getCourseID() {
        return courseID;
    }
    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNameAdditionalTasks() {
        return nameAdditionalTasks;
    }

    public void setNameAdditionalTasks(String nameAdditionalTasks) {
        this.nameAdditionalTasks = nameAdditionalTasks;
    }

    @Override
    public String toString() {
        return "AdditionalTasks{" +
                "nameAdditionalTasks='" + nameAdditionalTasks + '\'' +
                ", date='" + date + '\'' +
                ", teacher=" + teacher +
                ", courseID=" + courseID +
                '}';
    }
}

