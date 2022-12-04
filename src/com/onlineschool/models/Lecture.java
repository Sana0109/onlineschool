package com.onlineschool.models;


public class Lecture extends Faculty {
    private int courseID;

    private Person personID;

    public Lecture(int ID) {

        super(ID);

    }

    public Lecture(int ID, String nameCourse, String nameLecture, String groupNumber, Person personID) {
        super(ID, nameCourse, nameLecture, groupNumber);
        this.personID = personID;

    }

    public Lecture(String nameCourse, String nameLecture, String groupNumber, Person personID) {
        super(nameCourse, nameLecture, groupNumber);
        this.personID = personID;

    }



    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
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
        return " Name Lecture " + getNameLecture() + "\n Name Course " + getNameCourse() +
                "\n Person " + personID;

    }


}

