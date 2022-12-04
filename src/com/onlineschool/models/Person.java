package com.onlineschool.models;

public class Person extends Faculty {
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


    @Override
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return
                " ID = " + ID +
                        ", Course ID = " + courseID +
                        "\n " + role;
    }
}
