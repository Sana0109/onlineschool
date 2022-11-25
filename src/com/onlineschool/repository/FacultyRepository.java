package com.onlineschool.repository;


import com.onlineschool.Role;
import com.onlineschool.models.Faculty;
import com.onlineschool.models.Lecture;
import com.onlineschool.models.Person;

import java.util.Arrays;
import java.util.Scanner;


public class FacultyRepository {
    private int BOXES = 10;
    private Faculty[] faculties = new Faculty[BOXES];

    public Faculty getFacultyID(Integer ID) {
        Faculty[] faculties = new Faculty[10];
        faculties[0] = new Faculty(0, "NameCourse", "NameLecture", "Group Number");

        for (int i = 0; i < faculties.length; i++) {
            if (faculties[i].getID() == ID) {
                return faculties[i];
            }
            System.out.println(faculties[i]);
        }


        System.out.println("Faculty not found returning empty one");
        return new Faculty(0);

    }

    public Faculty addFaculty(Faculty faculty) {
        Faculty[] faculties = new Faculty[10];
        faculties[0] = new Faculty(0, "NameCourse", "NameLecture", "Group Number");
        faculties[1] = new Faculty(1, "NameCourse", "NameLecture", "Group Number");
        faculties[2] = new Faculty(2, "NameCourse", "NameLecture", "Group Number");

        for (int f = 0; f < faculties.length; f++) {
            if (faculties[f] == null) {
                faculties[f] = faculty;

                // return;

            }

            System.out.println(faculties[f]);
            System.out.println("-------------------------------");
        }

        return faculty;
    }

    public static void facultyArrayEnter() {

        Person person = new Person(1,1, Role.TEACHER );
        Lecture[] lectures = new Lecture[10];
        System.out.println("Added new Lecture");
        lectures[0] = new Lecture("Name Course", "Name Lecture","Group Number", person);
        System.out.println(lectures[0]);
        System.out.println("-------------------------------");

    }

    public static void outputID() {
        Person person = new Person(1,1, Role.TEACHER );

        com.onlineschool.models.Faculty faculty = new com.onlineschool.models.Faculty();
        com.onlineschool.models.Lecture lectures = new com.onlineschool.models.Lecture(1);
        lectures.setCourseID(faculty.getID());
        com.onlineschool.models.Lecture[] lectures1 = new com.onlineschool.models.Lecture[10];

        lectures1[0] = new Lecture(1, "Name Course", "Name Lecture","Group Number", person);
        lectures1[1] = new Lecture(1, "Name Course", "Name Lecture","Group Number", person);
        lectures1[2] = new Lecture(1, "Name Course", "Name Lecture","Group Number", person);
        lectures1[3] = new Lecture(2, "Name Course", "Name Lecture","Group Number", person);
        lectures1[4] = new Lecture(3, "Name Course", "Name Lecture","Group Number", person);
        lectures1[5] = new Lecture(4, "Name Course", "Name Lecture","Group Number", person);
        lectures1[6] = new Lecture(1, "Name Course", "Name Lecture","Group Number", person);
        lectures1[7] = new Lecture(1, "Name Course", "Name Lecture","Group Number", person);
        lectures1[8] = new Lecture(5, "Name Course", "Name Lecture","Group Number", person);
        lectures1[9] = new Lecture(1, "Name Course", "Name Lecture","Group Number", person);

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

                Scanner scanner = new Scanner(System.in);
                System.out.println("Deleted the selected Lecture: Yes - 1");
                int j = scanner.nextInt();
                System.out.println(lectures1[i]);
                System.out.println("---------------");
            }
        }


    }

    @Override
    public String toString() {
        return "FacultyRepository\n" +
                "BOXES=" + BOXES +
                ", faculties=" + Arrays.toString(faculties) +
                '}';
    }
}
