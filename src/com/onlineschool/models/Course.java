package com.onlineschool.models;

public class Course extends Faculty {


    public Course() {
        super();
    }

    public Course(int ID, String nameCourse, String nameLecture, Role role) {
        super(ID, nameCourse, nameLecture);

    }

    public Course(int ID) {

        this.getID();

    }
    public Course(int ID,String nameCourse, String nameLecture) {

        this.getID();

    }
    public Course(String nameLecture) {

        super(nameLecture);
    }
    @Override
    public String toString() {
        return "Course:\n " +
               "Name Course " +getNameCourse() + "\n "  + "Name Lecture "
                +getNameLecture() + "\n ID Course " + getID() + "\n " + Role.TEACHER;
    }

}




