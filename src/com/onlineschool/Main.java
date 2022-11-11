package com.onlineschool;



import com.onlineschool.models.Lecture;
import com.onlineschool.repository.CourseRepository;
import com.onlineschool.repository.LectureRepository;
import com.onlineschool.service.LectureService;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        LectureRepository lectureRepository = new LectureRepository();
        lectureRepository.addLecture(new Lecture(1));
        CourseRepository.courseArrayEnter();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Output ID Course:  YES - 1");
        int i = scanner.nextInt();
        LectureService.outputID();
    }

}



























