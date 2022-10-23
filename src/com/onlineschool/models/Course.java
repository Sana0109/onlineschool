package com.onlineschool.models;

public class Course {

    private String nameCourse;
    private String number;
    private Teacher teacher;
    private Lecture nameLecture;
    private Students students;
    public Long ID;

    public Course(Long ID,String nameCourse,Teacher teacher) {
        this.ID = ID;
        this.nameCourse = nameCourse;
        this.teacher = teacher;

    }
}
//public static long ID = 0;
//public long Counter;

// public  long Counter(long IDTest) {
//    return ID = Counter;
// }
//public Course(Long ID,String nameCourse) {
