package com.onlineschool.repository;

import com.onlineschool.models.Course;
import com.onlineschool.models.Lecture;
import com.onlineschool.models.ResourceType;
import com.onlineschool.models.Role;

import java.util.*;

public class LectureRepository extends GenericRepository {



    private final int BOXES = 10;
    private final Lecture[] lectures = new Lecture[BOXES];

    public final GenericRepository<Lecture> lecturesArray = new GenericRepository<>(new Lecture[]{}) {

        @Override
        public void expandArray() {
            super.expandArray();
        }

        @Override
        public int getArray(int index) {
            return 0;
        }
    };

    @Override
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

    public static void category() {
        Scanner scanner = new Scanner(System.in);

        //Course course = new Course();
        Lecture lecture = new Lecture();
        System.out.println("Choose Category: 1 - Course, 2 - Teacher, 3 - Students, 4 - Lecture");
        int i = 0;

        do {
            i = scanner.nextInt();
        } while (1 > 4);

        switch (i) {
            case 1:
                //System.out.println(course);
                break;
            case 2:
                System.out.println("Teacher " + Role.TEACHER);
                break;
            case 3:
                System.out.println("Students " + Role.STUDENT);
                break;
            case 4:
                System.out.println(lecture);
                break;

        }

    }


    @Override
    public String toString() {
        return "LectureRepository{" +
                "lectures = " + Arrays.toString(new GenericRepository[]{lecturesArray}) +
                '}';
    }
}
