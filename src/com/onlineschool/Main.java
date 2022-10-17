package com.onlineschool;

import com.onlineschool.service.LectureService;

public class Main {
    public static void main(String[] args) {
        LectureService Lecture = new LectureService();
        LectureService LectureSecond = new LectureService();
        LectureService LectureThird = new LectureService();


        System.out.println(LectureService.id);


    }

}
