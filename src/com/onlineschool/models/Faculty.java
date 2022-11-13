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

    public Faculty() {
        this(1);

    }
    public Faculty(String nameCourse,String nameLecture) {
        this.nameLecture = nameLecture;
        this.nameCourse = nameCourse;
    }
    public Faculty(int courseID) {

        this("NameCourse","NameLecture");
        this.courseID = courseID;
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
        return "Faculty{" +
                "nameCourse=" + nameCourse +
                ", nameLecture=" + nameLecture +
                ", courseID=" + courseID +
                ", groupNumber=" + groupNumber +
                '}';
    }

}

