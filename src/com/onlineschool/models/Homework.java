package com.onlineschool.models;

import java.util.function.Function;

public class Homework implements Comparable {
    private Integer ID;
    private Integer lectureID;
    private String task;
    private String nameHomework;
    private Course course;


    public Homework(Integer ID, Integer lectureID, String nameHomework) {
        this.ID = ID;
        this.lectureID = lectureID;
        this.nameHomework = nameHomework;

    }

    public Homework() {

    }

    public Homework(Integer lectureID) {
        this.lectureID = lectureID;
    }

    public Homework(Integer lectureID, String nameHomework) {

        this.lectureID = lectureID;

        this.nameHomework = nameHomework;
    }

    public Homework(String nameHomework) {
        this.nameHomework = nameHomework;


    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getLectureID() {
        return lectureID;
    }

    public void setLectureID(Integer lectureID) {
        this.lectureID = lectureID;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNameHomework() {
        return nameHomework;
    }

    public void setNameHomework(String nameHomework) {
        this.nameHomework = nameHomework;
    }

    @Override
    public String toString() {
        return "Homework  " +
                "lectureID = " + lectureID + ", " + nameHomework +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Homework homework = (Homework) o;

        int result = 0;
        if (lectureID > homework.lectureID)
            result = 1;
        if (lectureID < homework.lectureID)
            result = -1;

        return result;
    }
}
