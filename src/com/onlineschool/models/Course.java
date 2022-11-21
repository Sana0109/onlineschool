package com.onlineschool.models;

public class Course extends Faculty {
    private String secondNameTeacher;

    public Course() {
        super();
    }

    public Course(int ID, String nameCourse, String nameLecture, String groupNumber, String secondNameTeacher) {
        super(ID, nameCourse, nameLecture, groupNumber);
        this.secondNameTeacher = secondNameTeacher;
    }

    public Course(int ID) {
        this.getID();

    }

    public Course(String nameLecture) {
        super(nameLecture);
    }


    public String getSecondNameTeacher() {

        return secondNameTeacher;
    }

    public void setSecondNameTeacher(String secondNameTeacher) {

        this.secondNameTeacher = secondNameTeacher;
    }

    @Override
    public String toString() {
        return "Course\n " +
                getNameCourse() + "\n " + secondNameTeacher
                + "\n " + getGroupNumber() + "\n " + getNameLecture() + "\n ID Course " + getID();
    }

}




