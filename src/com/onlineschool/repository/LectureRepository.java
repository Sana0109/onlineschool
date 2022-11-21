package com.onlineschool.repository;

import com.onlineschool.models.Lecture;

import java.util.Arrays;

public class LectureRepository extends FacultyRepository {
    private int BOXES = 10;
    private Lecture[] lectures = new Lecture[BOXES];

    public Lecture getFacultyID(Integer ID) {


        return new Lecture(0);
    }


    public void addFaculty(Lecture lecture) {


    }

    public Lecture[] getLectures() {

        return lectures;
    }

    public int getBOXES() {
        return BOXES;
    }

    @Override
    public String toString() {
        return "LectureRepository{" +
                "lectures=" + Arrays.toString(lectures) +
                '}';
    }
}
