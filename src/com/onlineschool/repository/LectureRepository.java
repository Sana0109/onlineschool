package com.onlineschool.repository;

import com.onlineschool.models.Lecture;

import java.util.Arrays;

public class LectureRepository {
    private int BOXES = 10;
    private Lecture[] lectures = new Lecture[BOXES];

    public Lecture getLectureID(Integer ID) {
        for (int i = 0; i < lectures.length; i++) {
            if (lectures[i].getCourseID() == ID) {
                return lectures[i];
            }
        }

        System.out.println("Lecture not found returning empty one");
        return new Lecture(1);
    }


    public void addLecture(Lecture lecture) {

        for (int i = 0; i < lectures.length; i++) {

            if (lectures[i] == null) {
                lectures[i] = lecture;

                return;
            }

        }
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
