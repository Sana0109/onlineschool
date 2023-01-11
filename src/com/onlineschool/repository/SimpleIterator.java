package com.onlineschool.repository;

import com.onlineschool.models.Lecture;


import java.util.ListIterator;

public class SimpleIterator<E> implements ListIterator {


    public SimpleIterator(Lecture[] lectures) {
    }

    public SimpleIterator() {

    }

    public E next() {
        return null;
    }

    public boolean hasNext() {
        return false;
    }
    public void remove() {

    }
    @Override
    public boolean hasPrevious() {
        return false;
    }

    @Override
    public Object previous() {
        return null;
    }

    @Override
    public int nextIndex() {
        return 0;
    }

    @Override
    public int previousIndex() {
        return 0;
    }





    @Override
    public void set(Object o) {

    }

    @Override
    public void add(Object o) {

    }


    public ListIterator<E> listIterator(int i) {
        return null;
    }
}


