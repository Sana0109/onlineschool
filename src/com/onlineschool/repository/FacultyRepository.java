package com.onlineschool.repository;


import com.onlineschool.models.*;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;


public class FacultyRepository {

    private final static int BOXES = 10;
    private Faculty[] faculties = new Faculty[BOXES];



    public Faculty getFacultyID(Integer ID) {
        Faculty[] faculties = new Faculty[10];


        for (int i = 0; i < faculties.length; i++) {
            if (faculties[i].getID() == ID) {
                return faculties[i];
            }
            System.out.println(faculties[i]);
        }


        System.out.println("Faculty not found returning empty one");
        return new Faculty(1);

    }

    public void add(Faculty faculty) {
        Faculty[] faculties = new Faculty[10];
        faculties[0] = new Faculty(0, "NameCourse", "NameLecture");
        faculties[1] = new Faculty(1, "NameCourse", "NameLecture");
        faculties[2] = new Faculty(2, "NameCourse", "NameLecture");

        for (int f = 0; f < faculties.length; f++) {
            if (faculties[f] == null) {
                faculties[f] = faculty;


            }

            System.out.println(faculties[f]);
            System.out.println("-------------------------------");
        }


    }

    public static void facultyArrayEnter() {

        Lecture[] lectures = new Lecture[10];
        System.out.println("Added new Lecture");
        lectures[0] = new Lecture("Name lecture ",6,new Homework(),new Person(3, 3, Role.TEACHER("second name")));
        System.out.println(lectures[0]);
        System.out.println("-------------------------------");


    }



    public static void nameCoursePattern() {
        Scanner scanner = new Scanner(in);

        System.out.println("enter Course Name ");
        String nameCourseP = "\\D[a-zA-Z]\\D+";
        Pattern ptrn = Pattern.compile(nameCourseP);
        String nameCoursePattern = scanner.next();
        Matcher matcher = ptrn.matcher(nameCoursePattern);
        System.out.println("Course Name  " + nameCoursePattern + "\n" + matcher.find());

    }

    public static void nameLecturePattern() {
        Scanner scanner = new Scanner(in);

        System.out.println("enter Lecture Name ");
        String nameLectureP = "\\D[a-zA-Z]\\D+";
        Pattern ptrn = Pattern.compile(nameLectureP);
        String nameLecturePattern = scanner.next();
        Matcher matcher = ptrn.matcher(nameLecturePattern);
        System.out.println("Lecture Name " + nameLecturePattern + "\n" + matcher.find());

    }

    @Override
    public String toString() {
        return "FacultyRepository\n" +
                "BOXES=" + BOXES +
                ", faculties=" + Arrays.toString(faculties) +
                '}';
    }
}
