package com.onlineschool.repository;

import com.onlineschool.models.Students;

import java.util.Arrays;

public class StudentsRepository extends FacultyRepository {
    int BOXES = 10;
    Students[] student = new Students[BOXES];

    public Students[] getStudent() {
        return student;
    }

    public int getBOXES() {
        return BOXES;
    }

    @Override
    public String toString() {
        return "StudentsRepository{" +
                "BOXES=" + BOXES +
                ", student=" + Arrays.toString(student) +
                '}';
    }
}
