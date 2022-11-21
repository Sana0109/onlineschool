package com.onlineschool.models;

public class Homeworks extends Faculty {

    private String nameHomeworks;
    private Course course;


    public Homeworks(String nameHomeworks, Course course) {
        super(1);

        this.nameHomeworks = nameHomeworks;
        this.course = course;

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

