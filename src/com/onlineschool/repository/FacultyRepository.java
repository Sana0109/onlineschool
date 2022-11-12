package com.onlineschool.repository;

import com.onlineschool.models.Faculty;
import com.onlineschool.models.Lecture;

public class FacultyRepository {
    private int BOXES = 10;
    private Faculty[] faculties = new Faculty[BOXES];

    public Faculty getFacultyID(Integer ID) {
        for (int i = 0; i < faculties.length; i++) {
            if (faculties[i].getCourseID() == ID) {
                return faculties[i];
            }
        }

        System.out.println("Faculty not found returning empty one");
        return new Faculty(1);

    }
/*
    public void addFaculty(Faculty faculty) {
        for (int f = 0; f < faculties.length; f++) {
            if (faculties[f] == null) {
                faculties[f] = faculty;
                return;
            }
        }


    }
*/

}
