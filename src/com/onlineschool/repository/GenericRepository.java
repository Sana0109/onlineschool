package com.onlineschool.repository;

import com.onlineschool.models.AdditionalTasks;
import com.onlineschool.models.Log;

import java.util.Arrays;
import java.util.Comparator;


public abstract class GenericRepository<E> implements FacultyInterface<E>, Comparator<AdditionalTasks> {


    private E[] arrayGeneric;
    private static int BOXES = 10;


    @Override
    public void expandArray() {
        int twoBoxes = BOXES;
        BOXES = (BOXES * 3) / 2 + 1;
        E[] twoArrayGeneric = (E[]) new GenericRepository[BOXES];
        System.arraycopy(twoArrayGeneric, 0, twoArrayGeneric, 0, twoBoxes);
        arrayGeneric = twoArrayGeneric;
    }

    public GenericRepository() {
    }

    public E[] getArrayGeneric() {
        return arrayGeneric;
    }

    public int size() {

        int i = 0;// використовую в  34 рядку
        for (E element : arrayGeneric) {
            if (element != null) {
                i++;
            }
        }
        return arrayGeneric.length;
    }

    @Override
    public boolean isEmpty() {

        for (int j = 0; j < size(); j++) {
            if (arrayGeneric[j] != null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public E get(int index) {
        try {
            for (int i = 0; i < size(); i++) {
                if (index < 0 || index > size()) ;

            }
            return getArrayGeneric()[index];
        } catch (IndexOutOfBoundsException e) {
            Log.error("index out of bounds for length ");
        } finally {
            System.out.println("Length = " + size());
        }
        return arrayGeneric[0];
    }


    @Override
    public void add(int index, E element) {
        try {
            for (int i = 0; i < size(); i++) {
                if (arrayGeneric[i] == null && index != 0) {
                    arrayGeneric[index] = (E) element;
                    System.out.println("Array improve " + Arrays.toString(arrayGeneric));
                    break;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            Log.warning(" input wrong index = " + index);
        }

    }

    @Override
    public void add(E element) {
        for (int i = 0; i < size(); i++) {
            if (arrayGeneric[i] == null) {
                arrayGeneric[i] = (E) element;
                System.out.println(Arrays.toString(arrayGeneric));
                break;
            }
        }
    }

    public GenericRepository(E[] arrayGeneric) {
        this.arrayGeneric = arrayGeneric;
    }

    @Override
    public void remove(int index) {
        for (int i = 0; i < size(); i++) {
            if (arrayGeneric[index] == getArrayGeneric()[i]) {
                System.out.println("Before removal - " + Arrays.toString(arrayGeneric));
                arrayGeneric[i] = null;
                break;

            }
        }
        System.out.println("After removal - " + Arrays.toString(arrayGeneric));
    }

    public abstract int getArray(int index);

    @Override
    public int compare(AdditionalTasks o1, AdditionalTasks o2) {
        return 0;
    }
}

