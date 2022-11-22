package com.onlineschool.models;

public class Person {
    private int ID;
    private int courseID;
    private  String role;

    public Person(int ID,int courseID,String role){
        this.ID = ID;
        this.courseID = courseID;
        this.role = role;
    }
}
