package com.onlineschool;


import com.onlineschool.models.Course;
import com.onlineschool.models.Lecture;
import com.onlineschool.repository.LectureRepository;
import com.onlineschool.service.LectureService;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        LectureRepository lectureRepository = new LectureRepository();
        lectureRepository.addLecture(new Lecture(1));
        courseArrayEnter();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Output ID Course:  YES - 1");
        int i = scanner.nextInt();
        LectureService.outputID();
    }

    public static void courseArrayEnter() {

        Course[] courses = new Course[10];
        Lecture[] lecture = new Lecture[10];

        courses[0] = new Course(0, "Name Course", "Group Number", "Group Number", "Name Lecture");
        courses[1] = new Course(1, "Name Course", "Group Number", "Group Number", "Name Lecture");
        courses[2] = new Course(2, "Name Course", "Group Number", "Group Number", "Name Lecture");


        lecture[0] = new Lecture(1, "Name Lecture", "Name Course", "Second Name Teacher");
        lecture[1] = new Lecture(1, "Name Lecture", "Name Course", "Second Name Teacher");
        lecture[2] = new Lecture(1, "Name Lecture", "Name Course", "Second Name Teacher");


        int chooseStop = 0;
        int chooseStop2 = 2;
        for (int i = 0; i < courses.length; i++) {

            System.out.println(courses[i]);

            System.out.println("---------------");

            if (i == chooseStop) {
                break;

            }

        }
        for (int j = 0; j < lecture.length; j++) {

            System.out.println(lecture[j]);
            System.out.println("---------------");
            {
                if (j == chooseStop2) {
                    break;


                }
            }

        }

    }


}






/*Course[] courses = new Course[10];
        Arrays.sort(courses);
                System.out.println("Sorted Array: ");
                for (Course courses1 : courses){
                System.out.println(courses1);
                }

*/

//System.arraycopy(lecture,0,courses,1,3);





 /*
            System.out.println(lecture[0]);
            System.out.println(lecture[1]);
            System.out.println(lecture[2]);

*/
// System.out.println(Arrays.toString(courseRepository.getCourses()));
//System.out.println("---------------");
// System.out.println(Arrays.toString(lectureRepository.getLecturesArray()));


//}
//}

   /*     category();

        createLecture();

        //createWhile();
    }

    public static void category() {
        Scanner scanner = new Scanner(System.in);
        Teacher teacher = new Teacher("Second Name Teacher", "Name Teacher");
        Course course = new Course(1L, "Name Course", "Group Number", "Group Number");
        Lecture lecture = new Lecture("Name Lecture \n", "Name Course", "Second Name Teacher"
                , "Data", "Group Number", 1L);
        System.out.println("Choose Category: 1 - Course, 2 - Teacher, 3 - Students, 4 - Lecture");
        int i = 0;
        do {
            i = scanner.nextInt();
        } while (1 > 4);

        switch (i) {
            case 1:
                System.out.println(course);
                break;
            case 2:
                System.out.println(teacher);
                break;
            case 3:
                System.out.println("Students");
                break;
            case 4:
                System.out.println(lecture);
                break;
            default:
                System.out.println("Error");
        }

    }

    public static void createLecture() {
        System.out.println("-------------------");

        Scanner scanner = new Scanner(System.in);

        int i = 1;
        int chooseStop = 8;
        while (i < 10) {

            {
                System.out.println("Create a Lecture " + i);
                System.out.println(" Name Lecture");
                String nameLecture = scanner.next();
                System.out.println(" Name Course ");
                String nameCourse = scanner.next();
                System.out.println(" Second Name Teacher");
                String secondNameTeacher = scanner.next();
                System.out.println(" Data ");
                String data = scanner.next();
                System.out.println(" Group Number");
                String groupNumber = scanner.next();
                System.out.println(" ID Course ");
                Long courseID = scanner.nextLong();
                Lecture lecture1 = LectureService.lectureCreation(nameLecture, nameCourse,
                        secondNameTeacher, data, groupNumber, courseID);
                System.out.println(lecture1);

                System.out.println("-------------------");

            }
            if (i == chooseStop)
                break;
            i++;

        }
    }

}*/

/*String lecture = "\"Name Lecture \\n\", \"Name Course\", \"Second Name Teacher\", \"Data\", \"Group Number\", 0L";
        int courseID1 = lecture.indexOf('0');

        System.out.println(courseID1);

*/



 /*       String lecture = "\"Name Lecture \\n\", \"Name Course\", \"Second Name Teacher\", \"Data\", \"Group Number\", 0L";


        char[] result = lecture.toCharArray();
        for (int i = 0; i < result.length; i++)
            System.out.println("element [" + i + "]:" + result);
*/












