package com.onlineschool;


import com.onlineschool.repository.HomeworkRepository;
import com.onlineschool.repository.LectureRepository;


public class Main {
    public static void main(String[] args) {
        //зберігання домашніх завдань в Мар з lectureID та nameHomework
        HomeworkRepository.homeworkMap();
        System.out.println("---------------");
        //перегляд домашніх завдань та додаткових завдань через відкриття лекції по іd, видалити елемент, додати елемент
        LectureRepository.findAll();
    }
}




































