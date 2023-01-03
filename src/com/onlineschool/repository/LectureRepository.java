package com.onlineschool.repository;

import com.onlineschool.models.Lecture;

import java.util.Arrays;

public class LectureRepository extends GenericRepository {
    private int BOXES = 10;
    private Lecture[] lectures = new Lecture[BOXES];

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

    @Override
    public String toString() {
        return "LectureRepository{" +
                "lectures = " + Arrays.toString(new GenericRepository[]{lecturesArray}) +
                '}';
    }
}
