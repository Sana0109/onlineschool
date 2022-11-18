package com.onlineschool;



import com.onlineschool.models.Course;
import com.onlineschool.models.Faculty;
import com.onlineschool.models.Lecture;
import com.onlineschool.repository.CourseRepository;
import com.onlineschool.repository.FacultyRepository;
import com.onlineschool.repository.LectureRepository;
import com.onlineschool.service.LectureService;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
LectureService lectureService = new LectureService();
        Course course = new Course();
        Faculty faculties = new Faculty();
        LectureRepository lectureRepository = new LectureRepository();
        //System.out.println(lectureRepository);//повертає масив лекцій
    //    System.out.println(courseRepository);;
    //    LectureRepository lectureRepository = new LectureRepository();
    //  lectureRepository.addLecture(new Lecture(1));
        //CourseRepository.courseArrayEnter();
     FacultyRepository facultyRepository =  new FacultyRepository();
    //   System.out.println(lectureRepository);
       facultyRepository.addFaculty(faculties);//створені сутності факультету виводить увесь масив
       //facultyRepository.getFacultyID(0);
       //facultyRepository.addFaculty(new Faculty());
 //     FacultyRepository.facultyArrayEnter();// створена лекція
       Scanner scanner = new Scanner(System.in);
        System.out.println("Output ID Course:  YES - 1");
        int i = scanner.nextInt();
       lectureRepository.outputID();
       //Faculty.schedule();
//        lectureRepository.getLectures();

    }

}



























