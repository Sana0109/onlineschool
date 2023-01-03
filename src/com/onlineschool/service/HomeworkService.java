package com.onlineschool.service;


import com.onlineschool.models.Homework;

public class HomeworkService {
    public static Homework homeworkCreation(int ID,  int lectureID, String task, String nameHomework) {
        return new Homework(ID,lectureID,task,nameHomework);
    }
public static Homework homeworkLectureID(int lectureID){
        return new Homework(lectureID);
}
    public static int id = 0;
    public int idTest = 0;

    @Override
    public String toString() {
        return "HomeworkService{" +
                "idTest=" + idTest +
                '}';
    }

    public HomeworkService() {
        id++;
        idTest++;

    }
}
