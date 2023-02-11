package com.onlineschool;

import com.onlineschool.comparator.CourseComparator;
import com.onlineschool.comparator.PersonComparator;
import com.onlineschool.models.Course;
import com.onlineschool.models.Person;
import com.onlineschool.models.Role;
import com.onlineschool.repository.AdditionalTasksRepository;
import com.onlineschool.repository.HomeworkRepository;
import com.onlineschool.repository.LectureRepository;
import com.onlineschool.repository.LogRepository;

import java.util.SortedSet;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {
        //журнал роботи програми класс Log
        System.out.println("Storage Log:");
        LogRepository.logAll();
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
        System.out.println(additionalTasksRepository.chooseSort());

    }

}





































