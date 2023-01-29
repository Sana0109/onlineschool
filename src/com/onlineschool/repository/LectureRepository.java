package com.onlineschool.repository;

import com.onlineschool.models.*;

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

    public static void findAll() {

        List<Lecture> lectureCollectionArray = new ArrayList<>();
        lectureCollectionArray.add(new Lecture(1, new Homework[]{new Homework(1, "nameHomework 1")},
                new AdditionalTasks[]{new AdditionalTasks("aTasks 1")}));
        lectureCollectionArray.add(new Lecture(2, new Homework[]{new Homework(2,
                "nameHomework 2")}, new AdditionalTasks[]{new AdditionalTasks("aTasks2")}));
        lectureCollectionArray.add(new Lecture(3, new Homework[]{new Homework(3,
                "nameHomework 3")}, new AdditionalTasks[]{new AdditionalTasks("aTasks 3")}));
        lectureCollectionArray.add(new Lecture(4, new Homework[]{new Homework(4,
                "nameHomework 4")}, new AdditionalTasks[]{new AdditionalTasks("aTasks 4")}));
        lectureCollectionArray.add(new Lecture(5, new Homework[]{new Homework(5,
                "nameHomework 5")}, new AdditionalTasks[]{new AdditionalTasks("aTasks 5")}));

//перегляд домашніх завдань та додаткових завдань через відкриття лекції по іd
        ListIterator<Lecture> simpleIterator = lectureCollectionArray.listIterator(3);
        if (simpleIterator.hasNext())
            System.out.println("Choose lecture for ID :\n" + simpleIterator.next());
        System.out.println("---------------");
//видалити елемент
        simpleIterator.remove();
        System.out.println("After remove " + lectureCollectionArray);
        System.out.println("---------------");
//додати елемент
        simpleIterator.add(new Lecture(4, new Homework[]{new Homework(4,
                "nameHomework 4")}, new AdditionalTasks[]{new AdditionalTasks("aTasks 4")}));
        System.out.println("After added " + lectureCollectionArray);

    }

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
