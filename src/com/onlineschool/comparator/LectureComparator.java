package com.onlineschool.comparator;

import com.onlineschool.models.Lecture;

import java.util.Comparator;

public abstract class LectureComparator implements Comparator<Lecture> {
    @Override
    public int compare(Lecture o1, Lecture o2) {
        return o1.getNameLecture().compareTo(o2.getNameLecture());
    }
}
