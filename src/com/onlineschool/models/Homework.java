package com.onlineschool.models;

public class Homework {
    private int ID;
    private int lectureID;
    private String task;
    private String nameHomework;
    private Course course;


    public Homework(int ID, int lectureID, String task, String nameHomework) {
        this.ID = ID;
        this.lectureID = lectureID;
        this.task = task;
        this.nameHomework = nameHomework;

    }
    public Homework() {

    }
    public Homework(int lectureID) {
        this.lectureID = lectureID;
    }

    public Homework(String nameHomework, Course course) {


        this.nameHomework = nameHomework;
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



    public String getNameHomework() {
        return nameHomework;
    }

    public void setNameHomework(String nameHomework) {
        this.nameHomework = nameHomework;
    }

    @Override
    public String toString() {
        return "Homework{" +
                "Name Homework = " + getNameHomework()+ ", Lecture ID = "+ getLectureID() +
                ", Task = " + getTask() +
                '}';
    }
}
