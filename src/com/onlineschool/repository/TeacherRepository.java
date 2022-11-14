package com.onlineschool.repository;

import com.onlineschool.models.Teacher;

import java.util.Arrays;

public class TeacherRepository extends FacultyRepository{
    int BOXES = 12;
    Teacher[] teachers = new Teacher[BOXES];

    public Teacher[] getTeachers() {
        return teachers;
    }

    public int getBOXES() {
        return BOXES;
    }

    @Override
    public String toString() {
        return "TeacherRepository{" +
                "BOXES=" + BOXES +
                ", teachers=" + Arrays.toString(teachers) +
                '}';
    }
}

