package com.onlineschool.comparator;

import com.onlineschool.models.Homework;

import java.util.Comparator;

public abstract class HomeworkComparator implements Comparator<Homework>{
    @Override
    public int compare(Homework o1, Homework o2) {
        return o1.getNameHomework().compareTo(o2.getNameHomework());
    }

}
