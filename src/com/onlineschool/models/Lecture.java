package com.onlineschool.models;


public class Lecture  {
    private String nameLecture;
    private int courseID;
    private Homeworks homeworksID;
    private Person personID;

    public Lecture(String nameLecture, int courseID, Homeworks homeworksID, Person personID) {
        this.nameLecture = nameLecture;
        this.courseID = courseID;
        this.homeworksID = homeworksID;
        this.personID = personID;
    }

    public Lecture(int courseID) {

    }

    public String getNameLecture() {
        return nameLecture;
    }

    public void setNameLecture(String nameLecture) {
        this.nameLecture = nameLecture;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public Homeworks getHomeworksID() {
        return homeworksID;
    }

    public void setHomeworksID(Homeworks homeworksID) {
        this.homeworksID = homeworksID;
    }

    public Person getPersonID() {
        return personID;
    }

    public void setPersonID(Person personID) {
        this.personID = personID;
    }

    @Override
    public String toString() {
        return " Name Lecture " + getNameLecture() + "\n Course ID " + getCourseID() + "\n Homeworks ID " + getHomeworksID() +
                "\n Person ";

    }
//+ personID


}
//"\n Course ID "+getCourseID()+
