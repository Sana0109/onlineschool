package com.onlineschool.models;



public class Lecture extends Faculty {
    private int courseID;
   // private String nameCourse;
    private String secondNameTeacher;
   // private String nameLecture;

    public Lecture(int ID) {

        super(ID);

    }

    public Lecture(int ID, String nameCourse, String nameLecture, String groupNumber, String secondNameTeacher) {
        super(ID, nameCourse, nameLecture, groupNumber);
        this.secondNameTeacher = secondNameTeacher;
    }



    public String getSecondNameTeacher() {
        return secondNameTeacher;
    }

    public void setSecondNameTeacher(String secondNameTeacher) {
        this.secondNameTeacher = secondNameTeacher;
    }

    public int getCourseID() {
        return courseID;
    }

    public  void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    @Override
    public String toString() {
        return  "{ Course ID " + getID()+"\n Name Lecture "+getNameLecture() +"\n Name Course "+getNameCourse()+
                "\n Second Name Teacher " +secondNameTeacher+'}';

    }


}

