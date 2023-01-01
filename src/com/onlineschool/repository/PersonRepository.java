package com.onlineschool.repository;

import com.onlineschool.models.Role;
import com.onlineschool.models.Person;

import java.util.Arrays;


public class PersonRepository extends GenericRepository {
    private final int BOXES = 10;
    private Person[] people = new Person[BOXES];

    public int getBOXES() {
        return BOXES;
    }

    public Person[] getPeople() {
        return people;
    }

    public static Person createNewRole(int ID, int courseID, Role role) {
        return new Person(ID, courseID, role);
    }


    @Override
    public int getArray(int index) {
        return 0;
    }

    @Override
    public String toString() {
        return "PersonRepository" +
                "BOXES=" + BOXES +
                ", people=" + Arrays.toString(people)
                ;
    }
}
