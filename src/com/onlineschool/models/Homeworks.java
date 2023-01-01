package com.onlineschool.models;

public class Homeworks  {
    private int ID;
    private int lectureID;
    private String task;
    private String nameHomeworks;
    private Course course;


    public Homeworks(int ID, int lectureID, String task, String nameHomeworks) {
        this.ID = ID;
        this.lectureID = lectureID;
        this.task = task;
        this.nameHomeworks = nameHomeworks;

    }

    public Homeworks(String nameHomeworks, Course course) {


        this.nameHomeworks = nameHomeworks;
        this.course = course;

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

    public void setLectureID(int lectureID) {
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



    public String getNameHomeworks() {
        return nameHomeworks;
    }

    public void setNameHomeworks(String nameHomeworks) {
        this.nameHomeworks = nameHomeworks;
    }

    @Override
    public String toString() {
        return "Homeworks{" +
                "nameHomeworks='" + nameHomeworks + '\'' +
                ", course=" + course +
                '}';
    }
}

