package com.onlineschool.service;

import com.onlineschool.models.Lecture;
import com.onlineschool.repository.LectureRepository;

public class LectureService {

    private LectureRepository lectureRepository;
    private Lecture lecture;


    public static int id = 0;
    public int idTest = 0;

    public LectureService() {

        id++;
        idTest++;
    }


    public static Lecture lectureCreation(int courseID, String nameLecture, String nameCourse, String secondNameTeacher) {
        return new Lecture(courseID, nameLecture, nameCourse, secondNameTeacher);

    }

    public static Lecture lectureCourseID(int courseID) {
        return new Lecture(courseID);
    }




    public static void outputID() {


        com.onlineschool.models.Course course = new com.onlineschool.models.Course(1, "Name Course",
                "Group Number", "Group Number", "Name Lecture");
        com.onlineschool.models.Lecture lectures = new com.onlineschool.models.Lecture(1,
                "Name Lecture","Name Course","Second Name Teacher");
        lectures.setCourseID(course.getID());

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

            if (lectures1[i].getCourseID() == 1) {

                System.out.println(lectures1[i]);
            }


        }

    }

    @Override
    public String toString() {
        return "LectureService{" +
                "lectureRepository=" + lectureRepository +
                ", lecture=" + lecture +
                ", idTest=" + idTest +
                '}';
    }
}


//public Comparable<Long>

 /*   public static int getLength(String lecture1) {
        int i = 0;
        if (lecture1 == null) {
            throw new IllegalArgumentException("The argument cannot be null");

            //System.out.println("lecture1 = " + lecture1);
        }
        return lecture1.length();
    }
*/


  /*  public static void outputID() {

        com.onlineschool.models.Course course = new com.onlineschool.models.Course(0L, "Name Course", "Group Number", "Group Number", "Name Lecture");
        com.onlineschool.models.Lecture lecture = new com.onlineschool.models.Lecture("Name Lecture \n", "Name Course", "Second Name Teacher"
                , "Data", "Group Number", 1L);

        //lecture.setCourseID(Math.toIntExact(course.getID()));
        com.onlineschool.models.Lecture[] lecture1 = new com.onlineschool.models.Lecture[2];//int i = 0;


        for (int i = 1; i < lecture1.length; i++) {


                if (lecture1[i].getCourseID() == 1) {

                    System.out.println(""+lecture1(course.ID));

                }

        }
    }



}*/

 /*   public static int getLength(String lecture1) {
        int i = 0;
        if (lecture1 == null) {
            throw new IllegalArgumentException("The argument cannot be null");

            //System.out.println("lecture1 = " + lecture1);
        }
        return lecture1.length();
    }
}
*/


  /*  private static List<Integer>lecture1=null;
    public static List<Integer>getList(){
        if (lecture1==null)
            return Collections.emptyList();
        else
            return lecture1;
    }*/ //String lecture1[i]= null;
//if (lecture1.equals("test")) { if (lecture1 == null) {
//                throw new IllegalArgumentException("The argument cannot be null");
//
//
//            }
//            return ;
//        }
//        System.out.println("lecture1 = " + lecture1);