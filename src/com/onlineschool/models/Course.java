package com.onlineschool.models;

public class Course {

    public String nameCourse;
    public String number;
    public String secondNameTeacher;
    private Lecture nameLecture;
    public String groupNumber;
    public Long ID;



    public Course(Long ID, String nameCourse, String secondNameTeacher, String groupNumber) {

        this.ID = ID;
        this.nameCourse = nameCourse;
        this.secondNameTeacher = secondNameTeacher;
        this.groupNumber = groupNumber;
    }


    @Override
    public String toString() {
        return "Course\n" +
                nameCourse + secondNameTeacher
                + groupNumber + "\n ID Course " + ID;
    }

}




