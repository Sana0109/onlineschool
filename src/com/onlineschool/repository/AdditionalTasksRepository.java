package com.onlineschool.repository;

import com.onlineschool.comparator.AdditionalTasksComparator;
import com.onlineschool.models.AdditionalTasks;

import java.util.*;

import static com.onlineschool.comparator.AdditionalTasksComparator.StuGetID;

public class AdditionalTasksRepository extends GenericRepository {
    public boolean chooseSort() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sort by: 1 - for ID ; 2 - for lectureID; 3 - nameAdditionalTasks");
        int i = 0;

        do {
            i = scanner.nextInt();
        } while (1 > 3);

        switch (i) {
            case 1:
                //вибір по ІД
                ArrayList<AdditionalTasks> additionalTasks1 = new ArrayList<>();
                additionalTasks1.add(new AdditionalTasks("nameAdditionalTasks 3", 3, 3));
                additionalTasks1.add(new AdditionalTasks("nameAdditionalTasks 1", 2, 4));
                additionalTasks1.add(new AdditionalTasks("nameAdditionalTasks 2", 1, 1));
                Collections.sort(additionalTasks1, StuGetID);
                additionalTasks1.forEach(System.out::println);
                break;
            //вибір по lectureID
            case 2:
                ArrayList<AdditionalTasks> additionalTasks2 = new ArrayList<>();
                additionalTasks2.add(new AdditionalTasks("nameAdditionalTasks 8", 3, 3));
                additionalTasks2.add(new AdditionalTasks("nameAdditionalTasks 1", 2, 1));
                additionalTasks2.add(new AdditionalTasks("nameAdditionalTasks 2", 1, 4));
                additionalTasks2.sort(AdditionalTasks::compareTo);
                additionalTasks2.forEach(System.out::println);
                break;
            //вибір по назві
            case 3:
                AdditionalTasksComparator additionalTasksComparator = new AdditionalTasksComparator() {
                };
                SortedSet<AdditionalTasks> nameAdditionalTasks = new TreeSet<>(additionalTasksComparator);
                nameAdditionalTasks.add(new AdditionalTasks("nameAdditionalTasks 3", 3, 3));
                nameAdditionalTasks.add(new AdditionalTasks("nameAdditionalTasks 1", 2, 5));
                nameAdditionalTasks.add(new AdditionalTasks("nameAdditionalTasks 2", 1, 2));
                nameAdditionalTasks.forEach(System.out::println);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + i);
        }

        return false;
    }

    @Override
    public int getArray(int index) {
        return 0;
    }

    @Override
    public String toString() {
        return "AdditionalTasksRepository{" +
                ", additionalTasks = " +
                '}';
    }
}
