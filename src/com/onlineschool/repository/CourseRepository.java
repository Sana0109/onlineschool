package com.onlineschool.repository;

import com.onlineschool.models.Course;

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

}

