package com.onlineschool.repository;

import com.onlineschool.models.*;



public class CourseRepository extends GenericRepository {
    private static int BOXES = 10;
    private static Course[] courses = new Course[BOXES];


    public int size() {

        return super.size();

    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();

    }

    @Override
    public Object get(int index) {

        return super.get(index);

    }

    @Override
    public int getArray(int index) {
        return 0;
    }

    @Override
    public void add(Object element) {
        super.add(element);

    }


    @Override
    public void add(int index, Object element) {

        super.add(index, element);


    }

    @Override
    public void remove(int index) {

        super.remove(index);
    }

    @Override
    public void expandArray() {
        super.expandArray();
    }

    public static void courseArrayEnter() {

        Course[] courses = new Course[10];
        Lecture[] lectures = new Lecture[10];

        courses[0] = new Course();
        courses[1] = new Course();
        courses[2] = new Course();


        lectures[0] = new Lecture(1);
        lectures[1] = new Lecture(2);
        lectures[2] = new Lecture(3);


        int chooseStop = 0;
        int chooseStop2 = 2;
        for (int i = 0; i < courses.length; i++) {

            System.out.println(courses[i]);

            System.out.println("---------------");

            if (i == chooseStop) {
                break;

            }

        }
        for (int j = 0; j < lectures.length; j++) {

            System.out.println(lectures[j]);
            System.out.println("---------------");
            {
                if (j == chooseStop2) {
                    break;


                }
            }

        }

    }

    public static void facultyArrayEnter() {
        Course[] courses = new Course[10];
        System.out.println("Added new Course");
        courses[1] = new Course();
        System.out.println(courses[3]);
        System.out.println("-------------------------------");
    }

    public int getBOXES() {
        return BOXES;
    }

    @Override
    public String toString() {
        return "CourseRepository{}";
    }
}


