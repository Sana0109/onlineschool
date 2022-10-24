package com.onlineschool.models;

public class Course {

    private String nameCourse;
    private String number;
    private Teacher teacher;
    private Lecture nameLecture;
    private Students students;
    public Long ID;

    public Course(Long ID, String nameCourse, Teacher teacher) {
        this.ID = ID;
        this.nameCourse = nameCourse;
        this.teacher = teacher;

    }
   /* public  static void switchCourse() {

        switch (a){

            case 1:

                System.out.println("Students");
                break;
            case 2:
                System.out.println("Lecture");
                break;
             case 3:
                System.out.println("Teacher");
                break;
            default:
                System.out.println("Error");
        }


    }*/
}






//public static long ID = 0;
//public long Counter;

// public  long Counter(long IDTest) {
//    return ID = Counter;
// }
//public Course(Long ID,String nameCourse) {
