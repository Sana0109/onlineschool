package com.onlineschool.service;


import com.onlineschool.models.Homeworks;

public class HomeworkService {
    public static Homework homeworCreation(int ID,  int lectureID, String task, String nameHomeworks) {
        return new Homework(ID,lectureID,task,nameHomeworks);
    }
public static Homework homeworkLectureID(int lectureID){
        return new Homework(lectureID);
}
    public static int id = 0;
    public int idTest = 0;

    @Override
    public String toString() {
        return "HomeworksService{" +
                "idTest=" + idTest +
                '}';
    }

    public HomeworksService() {
        id++;
        idTest++;

    }
}
