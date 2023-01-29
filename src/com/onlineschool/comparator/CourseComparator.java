package com.onlineschool.comparator;

import com.onlineschool.models.Course;

import java.util.Comparator;

public abstract class CourseComparator implements Comparator<Course> {

    @Override
    public int compare(Course o1, Course o2) {

        return o1.getNameCourse().compareTo(o2.getNameCourse());
    }
}