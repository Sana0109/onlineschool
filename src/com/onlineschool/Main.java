package com.onlineschool;

import com.onlineschool.comparator.CourseComparator;
import com.onlineschool.comparator.PersonComparator;
import com.onlineschool.models.Course;
import com.onlineschool.models.Person;
import com.onlineschool.models.Role;
import com.onlineschool.repository.*;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;


public class Main {
   // public static void printThread(Thread myThread){
      //  System.out.println("State thread = " + myThread.currentThread().getState()+ "thread name" + myThread.getName());
   // }
    public  static void main(String[] args) {
       Person person = new Person(Role.STUDENT);
        //ControlWork controlWork = new ControlWork();
        Thread t1 = new Thread(person);
        t1.setName(" first   ");
        Thread t2 = new Thread(person);
        t2.setName(" second task for person ");
       /* Thread t3 = new Thread(person);
        t3.setName(" third thread for person ");
        Thread t4 = new Thread(person);
        t4.setName(" fourth thread for person ");
        Thread t5 = new Thread(person);
        t5.setName(" fifth thread for person ");
        Thread t6 = new Thread(person);
        t6.setName(" sixth thread for person ");
        Thread t7 = new Thread(person);
        t7.setName(" seventh thread for person ");
        Thread t8 = new Thread(person);
        t8.setName(" eighth thread for person ");
        Thread t9 = new Thread(person);
        t9.setName(" ninth thread for person ");
        Thread t10 = new Thread(person);
        t10.setName(" tenth thread for person ");*/

        t1.start();
       /* t10.start();
        t9.start();
        t8.start();
        t7.start();
        t6.start();
        t5.start();
        t4.start();
        t3.start();*/
        t2.start();




       // System.out.println("-----------------");
       /* Thread runnable = new Thread(new ControlWork()," Thread first");
        printThread(runnable);
        runnable.start();
        printThread(runnable);
        for (int i = 0; i < 100000000; i++) {
            for (int j = 0; j < 1000000000; j++) {

            }
        }
        printThread(runnable);*/
        //System.out.println("-----------------");
        //журнал роботи програми класс Log

/*        LogRepository.logAll();
        System.out.println("Storage Log:");
        System.out.println("-----------------");
        //зберігання домашніх завдань в Мар з lectureID та nameHomework
        HomeworkRepository.homeworkMap();
        System.out.println("---------------");
        //перегляд домашніх завдань та додаткових завдань через відкриття лекції по іd, видалити елемент, додати елемент
        LectureRepository.reviewingHomeworkLecture();
        System.out.println("-----------------");
        //сортування курсів за назвою
        {
            CourseComparator courseComparator = new CourseComparator() {
            };
            SortedSet<Course> nameCourse = new TreeSet<>(courseComparator);
            nameCourse.add(new Course("name 2"));
            nameCourse.add(new Course("name 3"));
            nameCourse.add(new Course("name 1"));
            nameCourse.add(new Course("name 4"));
            nameCourse.forEach(System.out::println);
            System.out.println("-----------------");
        }
        //сортування вчитилів за прізвищем
        {
            PersonComparator personComparator = new PersonComparator() {
            };
            SortedSet<Person> teacherName = new TreeSet<>(personComparator);
            teacherName.add(new Person(Role.TEACHER.getSecondName("fifth name")));
            teacherName.add(new Person(Role.TEACHER.getSecondName("first name")));
            teacherName.add(new Person(Role.TEACHER.getSecondName("third name")));
            teacherName.add(new Person(Role.TEACHER.getSecondName("fours name")));
            teacherName.add(new Person(Role.TEACHER.getSecondName("second name")));
            System.out.println("Teacher ");
            teacherName.forEach(System.out::println);
            System.out.println("-----------------");
        }
        //сортування студентів за прізвищем
        PersonComparator personComparator = new PersonComparator() {
        };
        SortedSet<Person> studentName = new TreeSet<>(personComparator);
        studentName.add(new Person(Role.STUDENT.getSecondName("Second name")));
        studentName.add(new Person(Role.STUDENT.getSecondName("Third name")));
        studentName.add(new Person(Role.STUDENT.getSecondName("Fours name")));
        studentName.add(new Person(Role.STUDENT.getSecondName("Fifth name")));
        System.out.println("Student ");
        studentName.forEach(System.out::println);
        System.out.println("-----------------");
        //сортування додаткових матеріалів за ID, lectureID, nameAdditionalTasks
        AdditionalTasksRepository additionalTasksRepository = new AdditionalTasksRepository();
        System.out.println(additionalTasksRepository.chooseSort());*/

    }

}





































