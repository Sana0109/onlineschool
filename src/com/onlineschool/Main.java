package com.onlineschool;




import com.onlineschool.models.Faculty;
import com.onlineschool.models.Person;
import com.onlineschool.repository.FacultyRepository;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Person person = new Person(1,6,Role.STUDENT);
        Faculty faculties = new Faculty();
        FacultyRepository facultyRepository =  new FacultyRepository();
        System.out.println("Create New Student \n"+person);//create new student
        System.out.println("\n----------------\n");
        FacultyRepository.facultyArrayEnter();//added a teacher to the lecture


    }

}



























