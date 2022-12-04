package com.onlineschool;


import com.onlineschool.models.Person;
import com.onlineschool.models.Role;
import com.onlineschool.repository.FacultyRepository;
import com.onlineschool.repository.PersonRepository;

import javax.print.attribute.standard.MediaSizeName;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import static java.lang.System.in;


public class Main {
    public static void main(String[] args) {

        System.out.println("Person ");
        PersonRepository.nameFirstStudentPattern();//audit first name student
        PersonRepository.nameSecondStudent();//audit second name student
        PersonRepository.phonePattern();//audit enter phone
        PersonRepository.emailPattern();//audit enter email
        FacultyRepository.nameCoursePattern();//audit enter course
        FacultyRepository.nameLecturePattern();//audit enter lecture
 /*

        System.out.println("enter Email" );
        String email = scanner.next();
       String simvol = "@";
*/

       // System.out.println(email+" "+email.contains(simvol));
       // System.out.println("Create New Student \n" + person);//create new student
        //System.out.println("\n----------------\n");
        //FacultyRepository.facultyArrayEnter();//added a teacher to the lecture
        //CourseRepository.facultyArrayEnter();//Added Course

       // System.out.println(pattern);
    }

    private static boolean nameFirstS(int start, int end) {
        return false;
    }

}



























