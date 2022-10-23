package com.onlineschool;

import com.onlineschool.models.Course;
import com.onlineschool.models.Lecture;
import com.onlineschool.models.Teacher;
import com.onlineschool.service.LectureService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Teacher teacher= new Teacher("SecondNameTeacher");
        Course course1 = new Course(11L, "NameCourse",teacher);
        Course course2 = new Course(12L, "NameCourse",teacher);
        Course course3 = new Course(13L, "NameCourse",teacher);
        Course course4 = new Course(14L, "NameCourse",teacher);
        Course course5 = new Course(15L, "NameCourse",teacher);
        Course course6 = new Course(16L, "NameCourse",teacher);
        Lecture lecture = new Lecture("Name",course1,teacher,"Date");
        Lecture lectureSecond = new Lecture("Name",course2,teacher,"Date");
        Lecture lectureThird = new Lecture("Name",course3,teacher,"Date");
        Lecture lectureFours = new Lecture("Name",course4,teacher,"Date");
        Lecture lectureFifth = new Lecture("Name",course5,teacher,"Date");
        Lecture lectureSixth = new Lecture("Name",course6,teacher,"Date");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();

        System.out.println(+course6.ID);

        System.out.println(lecture.id);


    }

}
