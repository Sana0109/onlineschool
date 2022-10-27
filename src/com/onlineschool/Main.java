package com.onlineschool;

import com.onlineschool.models.Course;
import com.onlineschool.models.Lecture;
import com.onlineschool.models.Teacher;
import com.onlineschool.service.CourseService;
import com.onlineschool.service.LectureService;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("second Name Teacher",
                "Name teacher");
        Course course = new Course(1L, "Name Course", "Second Name Teacher", "Group Number");
        Lecture lecture = new Lecture("Name Course", "Name Course",
                "Second Name Teacher", "Data", "Group Number");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Category: 1 - Course, 2 - Teacher, 3 - Students, 4 Lecture");
        int number = scanner.nextInt();
        CourseService.chooseCategory(number);
        ;
        System.out.println("-------------------");

        System.out.println("Create New Lecture: ");
        System.out.println(" Name Lecture");
        String nameLecture = scanner.next();
        System.out.println(" Name Course");
        String nameCourse = scanner.next();
        System.out.println(" Second Name Teacher");
        String secondNameTeacher = scanner.next();
        System.out.println(" Data");
        String data = scanner.next();
        System.out.println(" Group Number");
        String groupNumber = scanner.next();
        Lecture lecture1 = LectureService.lectureCreation(nameLecture, nameCourse, secondNameTeacher, data, groupNumber);
        System.out.println(lecture1);

        System.out.println("-------------------");

        int number1 = scanner.nextInt();


    }

}
