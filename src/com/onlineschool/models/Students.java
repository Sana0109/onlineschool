package com.onlineschool.models;

public class Students extends Faculty {

    private String name;
    private String secondName;
    private Course course;
    private String groupNumber;



    public Students(String groupNumber,String secondName,String name,Course course) {
        this.groupNumber= groupNumber;
        this.course = course;
        this.name = name;
        this.secondName = secondName;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", course=" + course +
                ", groupNumber='" + groupNumber + '\'' +
                '}';
    }
}

