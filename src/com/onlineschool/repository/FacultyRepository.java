package com.onlineschool.repository;

import com.onlineschool.models.Course;
import com.onlineschool.models.Faculty;
import com.onlineschool.models.Lecture;

import java.util.Arrays;

public class FacultyRepository {
    private int BOXES = 10;
    private Faculty[] faculties = new Faculty[BOXES];

    public  Faculty getFacultyID(Integer ID) {
        faculties[0] = new Faculty(1, "NameCourse", "NameLecture", "Group Number");
        for (int i = 0; i < faculties.length; i++) {
            if (faculties[i].getCourseID() == ID) {
                return faculties[i];
            }
            System.out.println(faculties[i]);
        }

        System.out.println("Faculty not found returning empty one");
        return new Faculty(1);

    }

    public  void addFaculty(Faculty faculty) {
        Faculty[] faculties = new Faculty[10];
         faculties[0] = new Faculty(1, "NameCourse", "NameLecture", "Group Number");
         faculties[1] = new Faculty(2, "NameCourse", "NameLecture", "Group Number");
         faculties[2] = new Faculty(1, "NameCourse", "NameLecture", "Group Number");
        for (int f = 0; f < faculties.length; f++) {
            if (faculties[f] == null) {
                faculties[f] = faculty;

                return;

            }

            System.out.println(faculties[f]);
            System.out.println("-------------------------------");
        }

    }


    public static void facultyArrayEnter(){
        Faculty[] faculties = new Faculty[10];
        Course[] courses = new Course[10];
        Lecture[] lectures = new Lecture[10];
        System.out.println("added new lecture");
        lectures[0] = new Lecture(1, "Name Lecture", "Name Course", "Second Name Teacher");
        System.out.println(lectures[0]);
        System.out.println("-------------------------------");
    }
    public static void outputID() {


        com.onlineschool.models.Faculty course = new com.onlineschool.models.Course(1, "Name Course",
                "Group Number", "Group Number", "Name Lecture");
        com.onlineschool.models.Lecture lectures = new com.onlineschool.models.Lecture(1,
                "Name Lecture","Name Course","Second Name Teacher");
        lectures.setCourseID(course.getCourseID());

        com.onlineschool.models.Faculty[] lectures1 = new com.onlineschool.models.Lecture[10];
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

            if (lectures1[i].getCourseID() == 2) {

                System.out.println(lectures1[i]);
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
