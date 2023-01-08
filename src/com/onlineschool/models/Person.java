package com.onlineschool.models;

public class Person  {
    private Integer ID;
    private Integer courseID;
    private Role role;

    public Person(Integer ID, Integer courseID, Role role) {
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

    public void setCourseID(Integer courseID) {
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
                " ID = " +getID() +
                        ", Course ID = " + getCourseID() +
                        "\n " + getRole();
    }
}
