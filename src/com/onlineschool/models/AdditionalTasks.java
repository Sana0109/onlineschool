package com.onlineschool.models;

import com.onlineschool.Faculty;

public class AdditionalTasks extends Faculty {

    private String nameAdditionalTasks;
    private String date;
    private Teacher teacher;
    private Course courseID;

    public AdditionalTasks(String nameAdditionalTasks,Course courseID,Teacher teacher,String date) {
        this.nameAdditionalTasks = nameAdditionalTasks;
        this.courseID = courseID;
        this.teacher = teacher;
        this.date = date;

    }

    public Course getCourseID() {
        return courseID;
    }

    public void setCourseID(Course courseID) {
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

