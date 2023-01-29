package com.onlineschool.models;


import java.util.Arrays;

public class Lecture implements Comparable {
    private String nameLecture;
    private Integer courseID;

    private Person personID;
    private ResourceType resourceType;
    private Integer ID;
    private Homework[] homeworks;
    private AdditionalTasks[] additionalTasks;

    public Lecture(String nameLecture, Integer courseID, Homework[] homeworks, Person personID) {
        this.nameLecture = nameLecture;
        this.courseID = courseID;
        this.homeworks = homeworks;
        this.personID = personID;

    }

    public Lecture(Integer ID, Homework[] homeworks, AdditionalTasks[] additionalTasks) {
        this.ID = ID;
        this.homeworks = homeworks;
        this.additionalTasks = additionalTasks;
    }

    public Lecture(Integer ID, String nameLecture) {
        this.ID = ID;
        this.nameLecture = nameLecture;
    }

    public Lecture(String nameLecture, Homework[] homeworks, AdditionalTasks[] additionalTasks) {
        this.nameLecture = nameLecture;
        this.homeworks = homeworks;
        this.additionalTasks = additionalTasks;
    }

    public Lecture(Integer courseID, ResourceType resourceType) {
        this.resourceType = resourceType;
        this.courseID = courseID;
    }

    public Lecture() {

    }

    public Integer getCourseID() {
        return courseID;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Homework[] getHomeworks() {
        return homeworks;
    }

    public void setHomeworks(Homework[] homeworks) {
        this.homeworks = homeworks;
    }

    public AdditionalTasks[] getAdditionalTasks() {
        return additionalTasks;
    }

    public void setAdditionalTasks(AdditionalTasks[] additionalTasks) {
        this.additionalTasks = additionalTasks;
    }

    public String getNameLecture() {
        return nameLecture;
    }

    public void setNameLecture(String nameLecture) {
        this.nameLecture = nameLecture;
    }


    public void setCourseID(Integer courseID) {
        this.courseID = courseID;
    }


    public Person getPersonID() {
        return personID;
    }

    public void setPersonID(Person personID) {
        this.personID = personID;
    }

    @Override
    public String toString() {
        return "Lecture  " +
                Arrays.toString(homeworks) +
                Arrays.toString(additionalTasks) +
                '}' + "\n";
    }

    @Override
    public int compareTo(Object o) {
        Lecture lecture = (Lecture) o;

        int result = 0;
        if (ID > lecture.ID)
            result = 1;
        if (ID < lecture.ID)
            result = -1;

        return result;
    }
}

