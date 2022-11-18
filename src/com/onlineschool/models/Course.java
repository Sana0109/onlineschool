package com.onlineschool.models;

public class Course extends Faculty {

    //private String nameCourse;
    private String secondNameTeacher;
   // private String nameLecture;
    //private String groupNumber;
   // private int ID;

    public Course(){
        super();

    }

    public Course(int ID, String nameCourse, String nameLecture, String groupNumber, String secondNameTeacher) {
        super(ID, nameCourse, nameLecture, groupNumber);
        this.secondNameTeacher = secondNameTeacher;
    }

    /*  public Course(int ID, String nameCourse, String secondNameTeacher, String groupNumber, String nameLecture) {
            //super(1);
            ID++;

            super.getNameCourse();
            this.secondNameTeacher = secondNameTeacher;
            this.getGroupNumber();
            this.getNameLecture();

        }*/
    public  Course(int ID){

        this.getID();
        //super(1);
    }
    public Course (String nameLecture){
        super(nameLecture);
    }


    public static void schedule() {
        System.out.println("Course Lecture secondNameTeacher");
    }
    public String getSecondNameTeacher() {

        return secondNameTeacher;
    }
    public void setSecondNameTeacher(String secondNameTeacher) {

        this.secondNameTeacher = secondNameTeacher;
    }
/*    public String getGroupNumber() {

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
*/
    @Override
    public String toString() {
        return "Course\n " +
                getNameCourse()+ "\n " + secondNameTeacher
                + "\n " + getGroupNumber() + "\n " + getNameLecture() + "\n ID Course " + getID();
    }

}




