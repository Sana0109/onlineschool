package com.onlineschool.models;

import com.onlineschool.Role;

public class Person extends Faculty {
    private int ID;
    private int courseID;
    private Role role;

    public Person(int ID,int courseID,Role role){
        this.ID = ID;
        this.courseID = courseID;
        this.role = role;
    }
    public Person(){

    }

    @Override
    public String toString() {
        return
                " ID = " + ID +
                ", Course ID = " + courseID +
                "\n " + role;
    }
}
