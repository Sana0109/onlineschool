package com.onlineschool.models;

public class Course {

    public String nameCourse;
    public String number;
    public String teacherSecondName;
    private Lecture nameLecture;
    public String groupNumber;
    public Long ID;




    public Course(Long ID,String nameCourse, String teacherSecondName,String groupNumber) {
        this.ID = ID;
        this.nameCourse = nameCourse;
        this.teacherSecondName = teacherSecondName;
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        return "Course\n"+
                  nameCourse  + teacherSecondName
                +groupNumber;
    }

}







//public static long ID = 0;
//public long Counter;

// public  long Counter(long IDTest) {
//    return ID = ++Counter;
// }
//public Course(Long ID,String nameCourse) {
