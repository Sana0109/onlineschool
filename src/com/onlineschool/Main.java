package com.onlineschool;


import com.onlineschool.models.Course;
import com.onlineschool.models.Lecture;

import com.onlineschool.models.Teacher;
import com.onlineschool.service.CourseService;
import com.onlineschool.service.LectureService;
import com.onlineschool.service.TeacherService;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //stopLecture();
        category();
        createWhile();
        createLecture();


    }

    public static void category() {
        Scanner scanner = new Scanner(System.in);
        Teacher teacher = new Teacher("Second Name Teacher", "Name Teacher");
        Course course = new Course(1L, "Name Course", "Group Number", "Group Number");
        Lecture lecture = new Lecture("Name Lecture \n", "Name Course", "Second Name Teacher"
                , "Data", "Group Number", 1L);
        System.out.println("Choose Category: 1 - Course, 2 - Teacher, 3 - Students, 4 - Lecture");
        int i = 0;
        do {
            i = scanner.nextInt();
        } while (1 > 4);

        switch (i) {
            case 1:
                System.out.println(course);
                break;
            case 2:
                System.out.println(teacher);
                break;
            case 3:
                System.out.println("Students");
                break;
            case 4:
                System.out.println(lecture);
                break;
            default:
                System.out.println("Error");
        }

    }

    public static void createLecture() {
        System.out.println("-------------------");
        System.out.println("Create a Lecture? 'YES' enter 1");
        Scanner scanner = new Scanner(System.in);
        while (true) {

            int chooseYes = scanner.nextInt();
            if (chooseYes == 1) {
                System.out.println(" Name Lecture");
                String nameLecture = scanner.next();
                System.out.println(" Name Course ");
                String nameCourse = scanner.next();
                System.out.println(" Second Name Teacher");
                String secondNameTeacher = scanner.next();
                System.out.println(" Data ");
                String data = scanner.next();
                System.out.println(" Group Number");
                String groupNumber = scanner.next();
                System.out.println(" ID Course ");
                Long courseID = scanner.nextLong();
                Lecture lecture1 = LectureService.lectureCreation(nameLecture, nameCourse,
                        secondNameTeacher, data, groupNumber, courseID);
                System.out.println(lecture1);

                System.out.println("-------------------");
            }
            System.out.println("Create a Lecture? 'YES' enter 1 ");


        }


    }


    public static void createWhile() {

        while (true) {
            break;
        }
    }
}
 /*   public  static  void stopLecture(){
        for (int i=0;i<10;i++){
            if (i==9){
                System.out.println("stop");
                break;

            }
        }
    }


}

/*    public static void category() {
        //Scanner scanner = new Scanner(System.in);
        Teacher teacher = new Teacher("Second Name Teacher","Name Teacher");
        Lecture lecture = new Lecture("Name Lecture \n", "Name Course", "Second Name Teacher"
                ,"Data", "Group Number", 1L) ;
        Course course = new Course(1L,"Name Course","Group Number","Group Number");


        int number = 0;

        do {
            System.out.println("Choose Category: 1 - Course, 2 - Teacher, 3 - Students, 4 - Lecture");

        } while (number<1 || number>3);

            switch (number) {
                case 1:
                    System.out.println(course);
                    break;
                case 2:
                    System.out.println(teacher);
                    break;
                case 3:
                    System.out.println("Students ");
                    break;
                case 4:
                    System.out.println(LectureService.lectureCreation("Name Lecture \n", "Name Course", "Second Name Teacher"
                            ,"Data", "Group Number", 1L));
                    break;



                default:



            }
        }

    }
*/

/*System.out.println("Error");
 */


//System.out.println("Exiting program...");
              /*  System.out.println("\nContinue Creating? 'YES' - 9 or 'NO' - 10");
                int choose2 = scanner.nextInt();
                switch (choose2) {
                    case 9 -> {
                        System.out.println(" Name Lecture ");
                        String nameLecture1 = scanner.next();
                        System.out.println(" Name Course  ");
                        String nameCourse1 = scanner.next();
                        System.out.println(" Second Name Teacher ");
                        String secondNameTeacher1 = scanner.next();
                        System.out.println(" Data  ");
                        String data1 = scanner.next();
                        System.out.println(" Group Number ");
                        String groupNumber1 = scanner.next();
                        System.out.println("ID Course ");
                        Long courseID1 = scanner.nextLong();
                        Lecture lecture2 = LectureService.lectureCreation(nameLecture1, nameCourse1, secondNameTeacher1,
                                data1, groupNumber1, courseID1);
                        System.out.println(lecture2);
                    }
                    case 10 -> System.out.println("Stop choose");
                }
            }
            case 10 -> System.out.println("Stop choose");
            default -> System.out.println("Error");
        }
        System.out.println("-------------------");

        System.out.println("Number Lecture - " + Lecture.id);*/



