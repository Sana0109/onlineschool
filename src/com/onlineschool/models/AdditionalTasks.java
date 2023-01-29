package com.onlineschool.models;

public class AdditionalTasks implements Comparable {

    private String nameAdditionalTasks;
    private Integer ID;

    private Integer lectureID;

    public AdditionalTasks(String nameAdditionalTasks, Integer ID, Integer lectureID) {
        this.nameAdditionalTasks = nameAdditionalTasks;
        this.ID = ID;
        this.lectureID = lectureID;
    }

    public AdditionalTasks(String nameAdditionalTasks) {
        this.nameAdditionalTasks = nameAdditionalTasks;
    }

    public String getNameAdditionalTasks() {
        return nameAdditionalTasks;
    }

    public void setNameAdditionalTasks(String nameAdditionalTasks) {
        this.nameAdditionalTasks = nameAdditionalTasks;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getLectureID() {
        return lectureID;
    }

    public void setLectureID(Integer lectureID) {
        this.lectureID = lectureID;
    }

    @Override
    public String toString() {
        return "AdditionalTasks = " + nameAdditionalTasks + ", "

                ;
    }

    @Override
    public int compareTo(Object o) {
        AdditionalTasks tasks = (AdditionalTasks) o;

        int result = 0;
        if (ID > tasks.ID)
            result = 1;
        if (ID < tasks.ID)
            result = -1;
        else if (lectureID > tasks.lectureID)
            result = 1;
        if (lectureID < tasks.lectureID)
            result = -1;
        return result;
    }

}

