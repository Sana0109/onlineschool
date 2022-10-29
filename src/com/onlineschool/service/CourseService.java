package com.onlineschool.service;

import com.onlineschool.models.Course;


public class CourseService {



    public static Course courseCreation(Long ID, String nameCourse, String secondNameTeacher, String groupNumber) {
        return new Course(ID, nameCourse, secondNameTeacher, groupNumber);


    }

    public static void chooseCategory(int number) {
        switch (number) {
            case 1:
                System.out.println(courseCreation(1L,"Name Course","Group Number","Group Number"));
                break;
            case 2:
                System.out.println("Teacher ");
                break;
            case 3:
                System.out.println("Students ");
                break;
            case 4:
                System.out.println(LectureService.lectureCreation("Name Lecture \n", "Name Course", "Second Name Teacher"
                        ,"Data", "Group Number", 1L));
                break;



            default:
                System.out.println("Error");
        }
    }



}

