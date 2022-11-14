package com.onlineschool.models;

public class Homeworks extends Faculty {

    private String nameHomeworks;
    private Course course;
    private Teacher teacher;

    public Homeworks(String nameHomeworks,Teacher teacher,Course course) {
        super(1);

        this.nameHomeworks = nameHomeworks;
        this.course = course;
        this.teacher = teacher;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
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
                ", teacher=" + teacher +
                '}';
    }
}

