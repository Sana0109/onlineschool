package com.onlineschool;

import com.onlineschool.models.Course;
import com.onlineschool.models.Lecture;
import com.onlineschool.models.Teacher;
import com.onlineschool.service.CourseService;
import com.onlineschool.service.LectureService;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Teacher teacher= new Teacher("SecondNameTeacher","NameTeacher");
        Course course = new Course(11L, "NameCourse",teacher);
        Course course2 = new Course(12L, "NameCourse",teacher);
        Course course3 = new Course(13L, "NameCourse",teacher);
        Course course4 = new Course(14L, "NameCourse",teacher);
        Course course5 = new Course(15L, "NameCourse",teacher);
        Course course6 = new Course(16L, "NameCourse",teacher);
        Lecture lecture = new Lecture("Name",course,teacher,"Date");
        Lecture lectureSecond = new Lecture("Name",course2,teacher,"Date");
        Lecture lectureThird = new Lecture("Name",course3,teacher,"Date");
        Lecture lectureFours = new Lecture("Name",course4,teacher,"Date");
        Lecture lectureFifth = new Lecture("Name",course5,teacher,"Date");
        Lecture lectureSixth = new Lecture("Name",course6,teacher,"Date");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Course ID "+lectureSixth.course.ID);

        System.out.println("Select course:" );
        //System.out.println("Student" );


        // String line = scanner.next();
        //System.out.println(line);
        int number = scanner.nextInt();
       switch (number){

            case 1:

                System.out.println( "Number "+number);
                break;
            case 2:
                System.out.println("Number "+number);
                break;
            case 3:
                System.out.println("Number "+number);
                break;
            default:
                System.out.println("Error");
        }

        System.out.println("Lecture" );
        int number1= scanner.nextInt();
        switch (number1){

            case 1:

                System.out.println("Name Math" );
                break;
            case 2:
                System.out.println("Name English" );
                break;
            case 3:
                System.out.println("Name Ukrainian" );
                break;
            default:
                System.out.println("Error");
        }
        System.out.println("Teacher" );
        int number2= scanner.nextInt();
        switch (number2){

            case 1:

                System.out.println("Name Jon ");
                break;
            case 2:
                System.out.println("Name Jim" );
                break;
            case 3:
                System.out.println("Name Sam" );
                break;
            default:
                System.out.println("Error");
        }
    }


}