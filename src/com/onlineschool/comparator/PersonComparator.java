package com.onlineschool.comparator;

import com.onlineschool.models.Person;

import java.util.Comparator;

public abstract class PersonComparator implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        return o1.getSecond_name().compareTo(o2.getSecond_name());
    }
}
