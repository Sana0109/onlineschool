package com.onlineschool;




import com.onlineschool.models.Faculty;
import com.onlineschool.repository.FacultyRepository;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Faculty faculties = new Faculty();
        FacultyRepository facultyRepository =  new FacultyRepository();
        facultyRepository.addFaculty(faculties);//returns an array
        FacultyRepository.facultyArrayEnter();//added new lecture

        Scanner scanner = new Scanner(System.in);
        System.out.println("Open the selected Lecture:  YES - 1");
        int i = scanner.nextInt();
        facultyRepository.outputID();//open the selected Lecture, deleted the selected Lecture


    }

}



























