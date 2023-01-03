package com.animal;


import com.onlineschool.models.*;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;


public class FacultyRepository {

    private final int BOXES = 10;
    private Faculty[] faculties = new Faculty[BOXES];

    public Faculty[] getFaculties() {
        return faculties;
    }

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

        Person person = new Person(2, 5, Role.TEACHER);
        Lecture[] lectures = new Lecture[10];
        System.out.println("Added new Lecture");
        lectures[0] = new Lecture("Name lecture",1,new Homeworks(),new Person());
        System.out.println(lectures[0]);
        System.out.println("-------------------------------");


    }

    /*public static void outputID() {
        Person person = new Person(1, 1, Role.TEACHER);

        com.onlineschool.models.Faculty faculty = new com.onlineschool.models.Faculty();
        com.onlineschool.models.Lecture lectures = new com.onlineschool.models.Lecture(1);
        lectures.setCourseID(faculty.getID());
        com.onlineschool.models.Lecture[] lectures1 = new com.onlineschool.models.Lecture[10];

        lectures1[0] = new Lecture(1);
        lectures1[1] = new Lecture(1);
        lectures1[2] = new Lecture(1);
        lectures1[3] = new Lecture(2);
        lectures1[4] = new Lecture(3);
        lectures1[5] = new Lecture(4);
        lectures1[6] = new Lecture(1);
        lectures1[7] = new Lecture(1);
        lectures1[8] = new Lecture(5);
        lectures1[9] = new Lecture(1);

        for (int i = 0; i < lectures1.length; i++) {

            if (lectures1[i].getID() == 1) {

                lectures1[i] = lectures;
                System.out.println("Open selected Lecture");
                System.out.println(lectures1[i]);
                System.out.println("---------------");

            }

        }
        for (int i = 0; i < lectures1.length; i++) {
            if (lectures1[i].getID() == 2) {
                lectures1[i] = null;

                Scanner scanner = new Scanner(in);
                System.out.println("Deleted the selected Lecture: Yes - 1");
                int j = scanner.nextInt();
                System.out.println(lectures1[i]);
                System.out.println("---------------");
            }
        }

        Utilit utilit = new Utilit();
        System.out.println((utilit));
    }*/

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
