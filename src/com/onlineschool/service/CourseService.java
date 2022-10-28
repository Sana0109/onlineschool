package com.onlineschool.service;

import com.onlineschool.models.Course;


public class CourseService {


    public static Course courseCreation(Long ID, String nameCourse, String teacherSecondName, String groupNumber) {
        return new Course(ID, nameCourse, teacherSecondName, groupNumber);
    }

    public static void chooseCategory(int number) {
        switch (number) {
            case 1:
                System.out.println(courseCreation(1L, " NameCourse  \n", " SecondNameTeacher \n ", "Group Number Students  "));
                break;
            case 2:
                System.out.println("Teacher ");
                break;
            case 3:
                System.out.println("Students ");
                break;
            case 4:
                System.out.println(LectureService.lectureCreation("Name Lecture \n", "Name Course", "SecondNameTeacher"
                        , "Data", "Group Number", 1L));
                break;

            default:
                System.out.println("Error");
        }
    }

}

