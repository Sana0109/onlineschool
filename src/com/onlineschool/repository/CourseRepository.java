package com.onlineschool.repository;

import com.onlineschool.models.Course;
import com.onlineschool.models.Lecture;

import java.util.Arrays;

public class CourseRepository {
    private int BOXES = 10;
    private Course[] courses = new Course[BOXES];

    public void addCourse(Course course) {

        for (int i = 0; i < courses.length; i++) {

            if (courses[i] == null) {
                courses[i] = course;

                return;



            }


            }
        expandArray();
        System.out.println("Array Increased");
        }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] course) {
        this.courses = courses;
    }
        private  void expandArray(){
        int twoBoxes = BOXES;
        BOXES = (BOXES*3) / 2 + 1;
        Course[] twoArrayCourse = new Course[BOXES];
        System.arraycopy(courses,0,twoArrayCourse,0,BOXES);

        courses = twoArrayCourse;
        }
    public static void courseArrayEnter() {

        Course[] courses = new Course[10];
        Lecture[] lectures = new Lecture[10];

        courses[0] = new Course(0, "Name Course", "Group Number", "Group Number", "Name Lecture");
        courses[1] = new Course(1, "Name Course", "Group Number", "Group Number", "Name Lecture");
        courses[2] = new Course(2, "Name Course", "Group Number", "Group Number", "Name Lecture");


        lectures[0] = new Lecture(1, "Name Lecture", "Name Course", "Second Name Teacher");
        lectures[1] = new Lecture(1, "Name Lecture", "Name Course", "Second Name Teacher");
        lectures[2] = new Lecture(1, "Name Lecture", "Name Course", "Second Name Teacher");


        int chooseStop = 0;
        int chooseStop2 = 2;
        for (int i = 0; i < courses.length; i++) {

            System.out.println(courses[i]);

            System.out.println("---------------");

            if (i == chooseStop) {
                break;

            }

        }
        for (int j = 0; j < lectures.length; j++) {

            System.out.println(lectures[j]);
            System.out.println("---------------");
            {
                if (j == chooseStop2) {
                    break;


                }
            }

        }

    }

    public int getBOXES() {
        return BOXES;
    }

    @Override
    public String toString() {
        return "CourseRepository{" +
                "BOXES=" + BOXES +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }
}


