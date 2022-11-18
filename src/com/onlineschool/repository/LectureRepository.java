package com.onlineschool.repository;

import com.onlineschool.models.Lecture;

import java.util.Arrays;

public class LectureRepository extends FacultyRepository{
    private int BOXES = 10;
    private Lecture[] lectures = new Lecture[BOXES];

   public Lecture getFacultyID(Integer ID) {
       /* for (int i = 0; i < lectures.length; i++) {
            if (lectures[i].getCourseID() == ID) {
                return lectures[i];
            }
        }*/

        System.out.println("Lecture not found returning empty one");
        return new Lecture(1);
    }


   public void addFaculty(Lecture lecture) {

       /* for (int i = 0; i < lectures.length; i++) {

            if (lectures[i] == null) {
                lectures[i] = lecture;

                return;
            }

        }*/
    }

    public Lecture[] getLectures() {

        return lectures;
    }

    public int getBOXES() {
        return BOXES;
    }
    public static void outputID() {


        com.onlineschool.models.Faculty faculty = new com.onlineschool.models.Faculty();
        com.onlineschool.models.Lecture lectures = new com.onlineschool.models.Lecture(0,"Name Lecture ",
                "Name Course ","Group Number","Second Name Teacher ");
        lectures.setCourseID(faculty.getID());
        com.onlineschool.models.Lecture[] lectures1 = new com.onlineschool.models.Lecture[10];

        lectures1[0] = new Lecture(1);
        lectures1[1] = new Lecture(1);
        lectures1[2] = new Lecture(1);
        lectures1[3] = new Lecture(2);
        lectures1[4] = new Lecture(3);
        lectures1[5] = new Lecture(4);
        lectures1[6] = new Lecture(1);
        lectures1[7] = new Lecture(1);
        lectures1[8] = new Lecture(5);
        lectures1[9] = new Lecture(1);

        for (int i = 0; i < lectures1.length; i++) {

            if (lectures1[i].getID() == 2) {

                    lectures1[i] = lectures;

                    System.out.println(lectures1[i]);
                System.out.println("---------------");
            }


        }

    }
    @Override
    public String toString() {
        return "LectureRepository{" +
                "lectures=" + Arrays.toString(lectures) +
                '}';
    }
}
