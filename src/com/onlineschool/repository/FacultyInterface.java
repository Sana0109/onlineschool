package com.onlineschool.repository;

public interface FacultyInterface<E> {
    default int size() {
        return size();

    }

    boolean isEmpty();

    E get(int index);

    void add(E element);


    void add(int index, E element);

    void remove(int index);

    void expandArray();


}
