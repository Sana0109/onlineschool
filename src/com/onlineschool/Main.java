package com.onlineschool;


import com.onlineschool.models.*;

import com.onlineschool.repository.*;

import java.util.*;


public class Main {
    public static void main(String[] args) {


//CourseRepository.courseArrayEnter();
        GenericRepository<Lecture> lecturesArray = new GenericRepository<>(new Lecture[]{
                new Lecture("Name lecture ",1,new Homework[]{new Homework(1,1,"Task",
                        "Name homework")},new Person()),
                new Lecture("Name lecture ",2,new Homework[]{new Homework(2,2,"Task",
                        "Name homework")},new Person()),
                new Lecture("Name lecture ",3,new Homework[]{new Homework(3,3,"Task",
                        "Name homework")},new Person()),

                null, null})
        {
            @Override
            public int getArray(int index) {
                return 0;
            }


        };

//LectureRepository.findAll();

        //Exception exception = new Exception();
//виключення для вибору категорії
  /*      try {
        LectureRepository.category();
        }catch (InputMismatchException e){
            System.out.println("wrong argument  " );
        }finally {
            System.out.println("Choose from the proposed" );
        }
        System.out.println("---------------");
//виключення для випадку виклика сутності по ID
        try {
            lecturesArray.get(7);
        }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("index out of bounds for length ");
        } finally {
            System.out.println("Length = " + lecturesArray.size()  );
        }
*/
       // System.out.println("Get = " + lecturesArray.get(2));//взяти елемент по індексу з масиву
        //System.out.println("---------------");
      //  System.out.println("Array length = " + lecturesArray.size());//розмір масиву
       // System.out.println("---------------");
       // System.out.println("Empty = " + lecturesArray.isEmpty());//чи масив пустий
       // System.out.println("---------------");
       // System.out.println("Get = " + lecturesArray.get(2));//взяти елемент по індексу з масиву
        //System.out.println("---------------");
        //System.out.println("Added Lecture element = ");
       // lecturesArray.add(new Lecture("Name lecture ",4,new Homework[]{new Homework(4,4,"Task",
         //       "Name homework")},new Person()));//додати елемент масиву

        System.out.println("---------------");
        System.out.println("Added Lecture = ");
        lecturesArray.add(4
                , new Lecture("Name lecture ",5,new Homework[]{new Homework(5,5,"Task",
                    "Name homework")},new Person()));//додати елемент масиву по індексу
        //System.out.println("---------------");
        //lecturesArray.remove(1);//видалити по індексу


    }


}




































