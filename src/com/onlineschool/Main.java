package com.onlineschool;

import com.onlineschool.models.Course;
import com.onlineschool.models.Lecture;
import com.onlineschool.models.Teacher;
import com.onlineschool.service.CourseService;
import com.onlineschool.service.LectureService;

import java.util.Arrays;

import com.onlineschool.service.CourseService;
import com.onlineschool.service.LectureService;
public class Main {
    public static void main(String[] args) {

        LectureService Lecture = new LectureService();
        LectureService LectureFours = new LectureService();
        LectureService LectureSixth = new LectureService();


        System.out.println(Lecture.id);

    }


}
