package com.onlineschool;




import com.onlineschool.comparator.CourseComparator;
import com.onlineschool.comparator.PersonComparator;
import com.onlineschool.models.*;
import com.onlineschool.repository.AdditionalTasksRepository;


import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {
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

        teacherName.forEach(System.out::println);

        }
*/
//сортування студентів за прізвищем
    PersonComparator personComparator = new PersonComparator(){};
    SortedSet<Person> studentName = new TreeSet<>(personComparator);

        studentName.add(new Person(Role.STUDENT.getSecondName("Second name")));
        studentName.add(new Person(Role.STUDENT.getSecondName("Third name")));
        studentName.add(new Person(Role.STUDENT.getSecondName("Fours name")));
        studentName.add(new Person(Role.STUDENT.getSecondName("Fifth name")));

        studentName.forEach(System.out::println);
        AdditionalTasksRepository additionalTasksRepository = new AdditionalTasksRepository();

        System.out.println(additionalTasksRepository.chooseSort());
}

}
 /*  List<Lecture> lectureArrayList = new ArrayList<>();
        List<Lecture> lecturesCopyList = new ArrayList<>();
        lecturesCopyList.add(0,new Lecture(6,ResourceType.BOOK));
        lecturesCopyList.add(1,new Lecture(7,ResourceType.BOOK));

        lectureArrayList.add(new Lecture(1, ResourceType.BOOK));
        lectureArrayList.add(new Lecture(2, ResourceType.BOOK));
        lectureArrayList.add(new Lecture(3, ResourceType.BOOK));
        lectureArrayList.add(new Lecture(4, ResourceType.BOOK));
        lectureArrayList.add(new Lecture(5, ResourceType.BOOK));
        System.out.println("array = " + lectureArrayList);

        System.out.println("--------------------");
        lectureArrayList.addAll(lecturesCopyList);
        System.out.println("addAll = " + lectureArrayList);

        System.out.println("--------------------");
        System.out.println("size = " + lectureArrayList.size());

        System.out.println("--------------------");
        System.out.println("Index 6 " + lectureArrayList.get(6));

        System.out.println("--------------------");
        System.out.println("Empty -" + lectureArrayList.isEmpty());

        System.out.println("--------------------");
        System.out.println("Remove 5" + lectureArrayList.remove(5));
        System.out.println("\n Array after remove " + lectureArrayList);*/



































