package com.onlineschool;


import com.onlineschool.models.Lecture;

import com.onlineschool.models.Teacher;
import com.onlineschool.service.CourseService;
import com.onlineschool.service.LectureService;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        /*public static void category() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose Category: 1 - Course, 2 - Teacher, 3 - Students, 4 - Lecture");
            int number = scanner.nextInt();
            CourseService.chooseCategory(number);
            ;
            System.out.println("-------------------");
        }*/
        stopWhile();
        createLecture();
    }
        public static void createLecture() {
            System.out.println("For exiting program enter 1");
            Scanner scanner = new Scanner(System.in);
            while (true) {
                int choose = scanner.nextInt();
                if (choose == 1) {
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
                    System.out.println("Create a Lecture? 'YES' enter 1");
            }

        }

        public static void stopWhile () {

            while (true) {
                break;
            }

    }
}
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



