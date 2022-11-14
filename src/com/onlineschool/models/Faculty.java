package com.onlineschool.models;

public class Faculty {
    private String nameCourse;
    private String nameLecture;
    private String groupNumber;
    private int courseID;

    public Faculty(int courseID,String nameCourse,String nameLecture,String groupNumber) {
        this.courseID = courseID;
        this.nameCourse = nameCourse;
        this.nameLecture = nameLecture;
        this.groupNumber = groupNumber;
    }

    public Faculty(Lecture nameLecture) {
        this(1);
    }
    public Faculty(String nameLecture) {
            this.nameLecture = nameLecture;
    }

    public Faculty(String nameCourse, String nameLecture, String groupNumber) {
        this.nameLecture = nameLecture;
        this.nameCourse = nameCourse;
        this.groupNumber = groupNumber;
    }
    public Faculty(int courseID) {
        this(1,"NameCourse","NameLecture","Group Number");
        this.courseID = courseID;

    }

    public Faculty() {

    }

    public void schedule(){
        System.out.println("Course Lecture Schedule");
    }
    public int getCourseID() {
        return courseID;
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
        return "Faculty\n" +
                " nameCourse = " + nameCourse +
                ",\n courseID = " + courseID +
                ",\n nameLecture = " + nameLecture +
                ",\n groupNumber = " + groupNumber ;
    }

}

