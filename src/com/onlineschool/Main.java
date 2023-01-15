package com.onlineschool;




import com.onlineschool.models.Lecture;
import com.onlineschool.models.ResourceType;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Lecture> lectureArrayList = new ArrayList<>();
        List<Lecture> lecturesCopyList = new ArrayList<>();
        lecturesCopyList.add(0,new Lecture(6,ResourceType.BOOK));
        lecturesCopyList.add(1,new Lecture(7,ResourceType.BOOK));

        lectureArrayList.add(new Lecture(1, ResourceType.BOOK));
        lectureArrayList.add(new Lecture(2, ResourceType.BOOK));
        lectureArrayList.add(new Lecture(3, ResourceType.BOOK));
        lectureArrayList.add(new Lecture(4, ResourceType.BOOK));
        lectureArrayList.add(new Lecture(5, ResourceType.BOOK));
        System.out.println("array = " + lectureArrayList);

        System.out.println("--------------------");
        lectureArrayList.addAll(lecturesCopyList);
        System.out.println("addAll = " + lectureArrayList);

        System.out.println("--------------------");
        System.out.println("size = " + lectureArrayList.size());

        System.out.println("--------------------");
        System.out.println("Index 6 " + lectureArrayList.get(6));

        System.out.println("--------------------");
        System.out.println("Empty -" + lectureArrayList.isEmpty());

        System.out.println("--------------------");
        System.out.println("Remove 5" + lectureArrayList.remove(5));
        System.out.println("\n Array after remove " + lectureArrayList);
    }


}




































