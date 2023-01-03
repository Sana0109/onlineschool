package com.onlineschool;


import com.onlineschool.models.Lecture;
import com.onlineschool.models.Person;
import com.onlineschool.repository.*;


public class Main {
    public static void main(String[] args) {
        GenericRepository<Lecture> lecturesArray = new GenericRepository<>(new Lecture[]{
                new Lecture(1, " c1", " l1", new Person()),
                new Lecture(2, " c2", " l2", new Person()),
                new Lecture(3, " c3", " l3", new Person()),
                new Lecture(4, " c4", " l4", new Person()), null, null}) {
            @Override
            public int getArray(int index) {
                return 0;
            }


        };
        System.out.println("Array length = " + lecturesArray.size());//розмір масиву
        System.out.println("---------------");
        System.out.println("Empty = " + lecturesArray.isEmpty());//чи масив пустий
        System.out.println("---------------");
        System.out.println("Get = " + lecturesArray.get(2));//взяти елемент по індексу з масиву
        System.out.println("---------------");
        System.out.println("Added Lecture element = ");
        // lecturesArray.add(new Lecture(5,"name course5","name lecture1",new Person()));//додати елемент масиву

        System.out.println("---------------");
        System.out.println("Added Lecture = ");
        lecturesArray.add(5
                , new Lecture(6, "name course6", "name lecture6", new Person()));//додати елемент масиву по індексу
        System.out.println("---------------");
        lecturesArray.remove(1);//видалити по індексу

     System.out.println("Person ");
        Utilit.nameFirstStudentPattern();//audit first name student
        Utilit.nameSecondStudent();//audit second name student
        Utilit.phonePattern();//audit enter phone
        Utilit.emailPattern();//audit enter email
        Utilit.nameCoursePattern();//audit enter course
        Utilit.nameLecturePattern();//audit enter lecture
    }


}




































