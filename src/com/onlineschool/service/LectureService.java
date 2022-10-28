package com.onlineschool.service;

import com.onlineschool.models.Course;
import com.onlineschool.models.Lecture;
import com.onlineschool.models.Students;
import com.onlineschool.models.Teacher;

public class LectureService {

    public static Lecture lectureCreation(String nameLecture, String nameCourse, String secondNameTeacher, String date, String groupNumber) {
        return new Lecture(nameLecture, nameCourse, secondNameTeacher, date, groupNumber);
    }

    public static void chooseLecture() {

        Students students1 = new Students("GroupNumber", "SecondName");
        Students students2 = new Students("GroupNumber", "SecondName");
        Students students3 = new Students("GroupNumber", "SecondName");
        Students students4 = new Students("GroupNumber", "SecondName");
        Students students5 = new Students("GroupNumber", "SecondName");
        Students students6 = new Students("GroupNumber", "SecondName");
        Students students7 = new Students("GroupNumber", "SecondName");

        Teacher teacher1 = new Teacher("SecondNameTeacher", "NameTeacher");
        Teacher teacher2 = new Teacher("SecondNameTeacher", "NameTeacher");
        Teacher teacher3 = new Teacher("SecondNameTeacher", "NameTeacher");
        Teacher teacher4 = new Teacher("SecondNameTeacher", "NameTeacher");
        Teacher teacher5 = new Teacher("SecondNameTeacher", "NameTeacher");
        Teacher teacher6 = new Teacher("SecondNameTeacher", "NameTeacher");
        Teacher teacher7 = new Teacher("SecondNameTeacher", "NameTeacher");

        Course course1 = new Course(11L, "NameCourse", teacher1.secondNameTeacher, students1.groupNumber);
        Course course2 = new Course(11L, "NameCourse", teacher2.secondNameTeacher, students2.groupNumber);
        Course course3 = new Course(11L, "NameCourse", teacher3.secondNameTeacher, students3.groupNumber);
        Course course4 = new Course(11L, "NameCourse", teacher4.secondNameTeacher, students4.groupNumber);
        Course course5 = new Course(11L, "NameCourse", teacher5.secondNameTeacher, students5.groupNumber);
        Course course6 = new Course(11L, "NameCourse", teacher6.secondNameTeacher, students6.groupNumber);
        Course course7 = new Course(11L, "NameCourse", teacher7.secondNameTeacher, students7.groupNumber);

        Lecture lecture1 = new Lecture("NameLecture", course1.nameCourse, teacher1.secondNameTeacher, "Date", students1.groupNumber);
        Lecture lecture2 = new Lecture("NameLecture", course2.nameCourse, teacher2.secondNameTeacher, "Date", students2.groupNumber);
        Lecture lecture3 = new Lecture("NameLecture", course3.nameCourse, teacher3.secondNameTeacher, "Date", students3.groupNumber);
        Lecture lecture4 = new Lecture("NameLecture", course4.nameCourse, teacher4.secondNameTeacher, "Date", students4.groupNumber);
        Lecture lecture5 = new Lecture("NameLecture", course5.nameCourse, teacher5.secondNameTeacher, "Date", students5.groupNumber);
        Lecture lecture6 = new Lecture("NameLecture", course6.nameCourse, teacher6.secondNameTeacher, "Date", students6.groupNumber);
        Lecture lecture7 = new Lecture("NameLecture", course7.nameCourse, teacher7.secondNameTeacher, "Date", students7.groupNumber);


       // switch (number1){
            //case 8:
               // System.out.println(LectureService.lectureCreation(" Name Lecture \n","Name Course",
                     //   "Second Name Teacher","Data","Group Number"));
               // break;
           /* case 1:
                System.out.println(lecture1);
                break;
            case 2:
                System.out.println(lecture2);
                break;
            case 3:
                System.out.println(lecture3);
                break;
            case 4:
                System.out.println(lecture4);
                break;
            case 5:
                System.out.println(lecture5);
                break;
            case 6:
                System.out.println(lecture6);
                break;
            case 7:
                System.out.println(lecture7);
                break;
            default:
                System.out.println("Error");
        }*/


}

}
