package com.onlineschool.models;

public class Course extends Faculty {

    private String nameCourse;
    private String secondNameTeacher;
    private String nameLecture;
    private String groupNumber;
    private int ID;

    public Course(){
        super();

    }
    public Course(int ID, String nameCourse, String secondNameTeacher, String groupNumber, String nameLecture) {
        super(1);
        ID++;
        //this.ID = ID;
        this.nameCourse = nameCourse;
        this.secondNameTeacher = secondNameTeacher;
        this.groupNumber = groupNumber;
        this.nameLecture = nameLecture;

    }
    public  Course(int ID){
        super(1);
    }
    public Course (String nameLecture){
        super(nameLecture);
    }

    public Course(Lecture nameLecture) {
        super(nameLecture);
    }

    @Override
    public void schedule() {
        System.out.println("Course Lecture secondNameTeacher");
    }

    public String getGroupNumber() {

        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {

        this.groupNumber = groupNumber;
    }

    public String getNameLecture() {

        return nameLecture;
    }

    public void setNameLecture(String nameLecture) {

        this.nameLecture = nameLecture;
    }

    public String getSecondNameTeacher() {

        return secondNameTeacher;
    }

    public void setSecondNameTeacher(String secondNameTeacher) {

        this.secondNameTeacher = secondNameTeacher;
    }

    public String getNameCourse() {

        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {

        this.nameCourse = nameCourse;
    }

    public int getID() {

        return ID;
    }

    public void setID(int ID) {

        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Course\n " +
                nameCourse + "\n " + secondNameTeacher
                + "\n " + groupNumber + "\n " + nameLecture + "\n ID Course " + ID;
    }

}




