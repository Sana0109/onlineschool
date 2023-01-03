package com.onlineschool.service;


import com.onlineschool.models.Homework;

import com.onlineschool.models.Lecture;
import com.onlineschool.models.Person;
import com.onlineschool.repository.LectureRepository;

public class LectureService {

    private LectureRepository lectureRepository;
    private Lecture lecture;


    public static int id = 0;
    public int idTest = 0;

    public LectureService() {

        id++;
        idTest++;
    }


    public static Lecture lectureCreation(String nameLecture, int courseID, Homework[] homeworks, Person personID) {
        return new Lecture(nameLecture, courseID, homeworks, personID);

    }

    public static Lecture lectureCourseID(int courseID) {
        return new Lecture(courseID);
    }


    @Override
    public String toString() {
        return "LectureService{" +
                "lectureRepository=" + lectureRepository +
                '}';
    }
}




