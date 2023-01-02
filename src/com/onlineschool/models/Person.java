package com.onlineschool.models;

public class Person  {
    private int ID;
    private int courseID;
    private Role role;

    public Person(int ID, int courseID, Role role) {
        this.ID = ID;
        this.courseID = courseID;
        this.role = role;

    }

    public Person() {

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return
                " ID = " + ID +
                        ", Course ID = " + courseID +
                        "\n " + role;
    }
}
