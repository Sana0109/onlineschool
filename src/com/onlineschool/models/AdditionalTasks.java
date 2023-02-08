package com.onlineschool.models;


import java.util.Objects;

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

    public AdditionalTasks(String nameAdditionalTasks, Integer lectureID) {
        this.nameAdditionalTasks = nameAdditionalTasks;
        this.lectureID = lectureID;
    }


    @Override
    public int hashCode() {
        return Objects.hash(nameAdditionalTasks, ID);
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
        return "ID = "+ ID +", AdditionalTasks = " + nameAdditionalTasks + ", LectureID = " + lectureID + ", ";
    }

    @Override
    public int compareTo(Object compareResult) {

        Integer result = ((AdditionalTasks) compareResult).getLectureID();

        return this.lectureID - result;
    }

}


