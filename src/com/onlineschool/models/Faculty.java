package com.onlineschool.models;

public class Faculty {
    private String nameCourse;
    private String nameLecture;
    private String groupNumber;
    private int ID;

    public Faculty(int ID, String nameCourse, String nameLecture) {

        this.ID = ID;
        this.nameCourse = nameCourse;
        this.nameLecture = nameLecture;


    }

    public Faculty(int ID) {
        this.ID = ID;

    }

    public Faculty(String nameLecture) {

        this.nameLecture = nameLecture;
    }

    public Faculty(String nameCourse, String nameLecture, String groupNumber) {
        this.nameLecture = nameLecture;
        this.nameCourse = nameCourse;
        this.groupNumber = groupNumber;

    }

    public Faculty() {

    }


    public int getID() {
        return ID;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public String getNameLecture() {
        return nameLecture;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    @Override
    public String toString() {
        return "\n Faculty\n" +
                " nameCourse = " + nameCourse +
                ",\n courseID = " + ID +
                ",\n nameLecture = " + nameLecture +
                ",\n groupNumber = " + groupNumber;
    }

}

