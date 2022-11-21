package com.onlineschool;



import com.onlineschool.models.Course;
import com.onlineschool.models.Faculty;
import com.onlineschool.repository.FacultyRepository;
import com.onlineschool.repository.LectureRepository;
import com.onlineschool.service.LectureService;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Faculty faculties = new Faculty();
        LectureRepository lectureRepository = new LectureRepository();
        FacultyRepository facultyRepository =  new FacultyRepository();
        facultyRepository.addFaculty(faculties);//створені сутності факультету виводить увесь масив

        FacultyRepository.facultyArrayEnter();// створена лекція
       // Scanner scanner = new Scanner(System.in);
       // System.out.println("Open the selected Lecture:  YES - 1");
       // int i = scanner.nextInt();
        facultyRepository.outputID();


    }

}



























