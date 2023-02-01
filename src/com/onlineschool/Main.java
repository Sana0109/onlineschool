package com.onlineschool;


import com.onlineschool.models.*;
import com.onlineschool.repository.*;
import java.util.InputMismatchException;


public class Main {
    public static void main(String[] args) {
        GenericRepository<Lecture> lecturesArray = new GenericRepository<>(new Lecture[]{
                new Lecture("Name lecture ", 1, new Homework[]{new Homework(1, 1, "Task",
                        "Name homework")}, new Person()),
                new Lecture("Name lecture ", 2, new Homework[]{new Homework(2, 2, "Task",
                        "Name homework")}, new Person()),
                new Lecture("Name lecture ", 3, new Homework[]{new Homework(3, 3, "Task",
                        "Name homework")}, new Person()),

                null, null}) {
            @Override
            public int getArray(int index) {
                return 0;
            }


        };
//виключення для вибору категорії
        try {
            LectureRepository.category();
        } catch (InputMismatchException e) {
            System.out.println("wrong argument  ");
        } finally {
            System.out.println("Choose from the proposed");
        }
        System.out.println("---------------");
//виключення для випадку виклика сутності по ID створено в класі GenericRepository

        System.out.println(lecturesArray.get(5));
        System.out.println("---------------");

//виключення для add створено в класі GenericRepository

        System.out.println("Added Lecture = ");
        lecturesArray.add(7

                , new Lecture("Name lecture ", 5, new Homework[]{new Homework(5, 5, "Task",
                        "Name homework")}, new Person()));//додати елемент масиву по індексу


    }


}



































