package com.onlineschool;




import com.onlineschool.models.Lecture;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class Main {
    public static void main(String[] args) {
//знаходилось в класі LectureRepository
            List<Lecture> lectureCollectionArray = new ArrayList<>();
            lectureCollectionArray.add(new Lecture(1));
            lectureCollectionArray.add(new Lecture(2));
            lectureCollectionArray.add(new Lecture(3));
            lectureCollectionArray.add(new Lecture(4));
            lectureCollectionArray.add(new Lecture(5));

            System.out.println("The whole collection :\n" + lectureCollectionArray);
            System.out.println("---------------");

            ListIterator<Lecture> simpleIterator = lectureCollectionArray.listIterator(2);
            if (simpleIterator.hasNext())
                System.out.println("Choose element :\n" + simpleIterator.next());
            System.out.println("---------------");
            simpleIterator.remove();
            System.out.println("A collection without a deleted element :\n" + lectureCollectionArray);




    }


}




































