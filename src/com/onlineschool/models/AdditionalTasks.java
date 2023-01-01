package com.onlineschool.models;

public class AdditionalTasks  {

    private String nameAdditionalTasks;
    private String date;

    private int courseID;



    public AdditionalTasks(String nameAdditionalTasks, int courseID, String date) {

        this.nameAdditionalTasks = nameAdditionalTasks;
        this.courseID = courseID;
        this.date = date;

    }

    public int getCourseID() {
        return courseID;
    }
    public void setCourseID(int courseID) {
        this.courseID = courseID;
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
                ", courseID=" + courseID +
                '}';
    }
}

