package repository;

import com.onlineschool.models.Course;

import java.util.Arrays;

public class CourseRepository {
    private int BOXES = 10;
    private Course[] coursesArray = new Course[BOXES];

    public void addCourse(Course course) {

        for (int i = 0; i < coursesArray.length; i++) {

            if (coursesArray[i] == null) {
                coursesArray[i] = course;

                break;



            }else

                System.out.println("Array Increased");
                expandArray();
            }

        }


        private  void expandArray(){
        int twoBoxes = BOXES;
        BOXES = (BOXES*3) / 2 + 1;
        Course[] twoArrayCourse = new Course[BOXES];
        System.arraycopy(coursesArray,0,twoArrayCourse,0,BOXES);

        coursesArray = twoArrayCourse;
        }
    public Course[] getCourses() {
        return coursesArray;
    }

    public void setCourses(Course[] courses) {
        this.coursesArray = courses;
    }

    @Override
    public String toString() {
        return "CourseRepository{" +
                "coursesArray=" + Arrays.toString(coursesArray) +
                '}';
    }
}

