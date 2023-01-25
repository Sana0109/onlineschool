package com.onlineschool;


import com.onlineschool.comparator.HomeworkComparator;
import com.onlineschool.models.*;


import java.util.*;


public class Main {
    public static void main(String[] args) {
 //зберігання домашніх завдань в Мар з lectureID та nameHomework
        Map<Homework, Homework> homeworkMap1 = Map.of(
                new Homework(3), new Homework("third"),
                new Homework(2), new Homework("second"),
                new Homework(1), new Homework("first")
        );
        System.out.println(homeworkMap1.values());
  /*     HomeworkComparator homeworkComparator = new HomeworkComparator() {};
        SortedMap<Homework , Homework> homeworkMap = new TreeMap<>(homeworkComparator);
        homeworkMap.put(new Homework(3), new Homework("String"));
        homeworkMap.put(new Homework(2), new Homework("second"));
        homeworkMap.put(new Homework(1), new Homework("first"));
    Iterator<Map.Entry<Homework , Homework>> itr = homeworkMap.entrySet().iterator();
        while (itr.hasNext()){
        Map.Entry<Homework , Homework> entry = itr.next();
            Homework key = entry.getKey();
            Homework value = entry.getValue();

}
       System.out.println(homeworkMap.lastKey());


        //сортування курсів за назвою
       /* CourseComparator courseComparator = new CourseComparator() {};
        SortedSet<Course> nameCourse = new TreeSet<>(courseComparator);
        nameCourse.add(new Course("name 2"));
        nameCourse.add(new Course("name 3"));
        nameCourse.add(new Course("name 1"));
        nameCourse.add(new Course("name 4"));
        nameCourse.forEach(System.out::println);
    }*/
//сортування вчитилів за прізвищем
  /*      PersonComparator personComparator = new PersonComparator(){};
        SortedSet<Person> teacherName = new TreeSet<>(personComparator);

        teacherName.add(new Person(Role.TEACHER.getSecondName("fifth name")));
        teacherName.add(new Person(Role.TEACHER.getSecondName("first name")));
        teacherName.add(new Person(Role.TEACHER.getSecondName("third name")));
        teacherName.add(new Person(Role.TEACHER.getSecondName("fours name")));
        teacherName.add(new Person(Role.TEACHER.getSecondName("second name")));
        System.out.println("Teacher " );
        teacherName.forEach(System.out::println);

        }
*/
//сортування студентів за прізвищем
  /*      PersonComparator personComparator = new PersonComparator() {
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




































