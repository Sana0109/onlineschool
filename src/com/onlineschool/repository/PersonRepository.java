package com.onlineschool.repository;

import com.onlineschool.Role;
import com.onlineschool.models.Person;

import java.util.Arrays;

public class PersonRepository extends FacultyRepository{
    private int BOXES = 10;
    private Person[] people = new Person[BOXES];

    public int getBOXES() {
        return BOXES;
    }

    public Person[] getPeople() {
        return people;
    }
    public static Person createNewRole(int ID,int courseID,Role role){
        return new Person(ID,courseID,role);
    }

    @Override
    public String toString() {
        return "PersonRepository" +
                "BOXES=" + BOXES +
                ", people=" + Arrays.toString(people)
                ;
    }
}
