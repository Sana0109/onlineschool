package com.onlineschool.service;


import com.onlineschool.models.Homeworks;

public class HomeworksService {
    public static Homeworks homeworksCreation(int ID,  int lectureID, String task, String nameHomeworks) {
        return new Homeworks(ID,lectureID,task,nameHomeworks);
    }
public static Homeworks homeworksLectureID(int lectureID){
        return new Homeworks(lectureID);
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
