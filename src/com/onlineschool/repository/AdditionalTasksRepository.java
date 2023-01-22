package com.onlineschool.repository;

import com.onlineschool.comparator.AdditionalTasksComparator;
import com.onlineschool.models.AdditionalTasks;


import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;


public class AdditionalTasksRepository extends GenericRepository {
    private final static int BOXES = 10;
    AdditionalTasks[] additionalTasks = new AdditionalTasks[BOXES];
    public final GenericRepository<AdditionalTasks> additionalTasksArray = new GenericRepository<>(new AdditionalTasks[]{}) {
        @Override
        public int getArray(int index) {
            return 0;
        }
    };

    public boolean chooseSort() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sort by: 1 - for ID ; 2 - for lectureID; 3 - nameAdditionalTasks");
        int i = 0;

        do {
            i = scanner.nextInt();
        } while (1 > 3);

        switch (i) {
            case 1:
                AdditionalTasks[] additionalTasks1 = new AdditionalTasks[]{
                        new AdditionalTasks("nameAdditionalTasks 3", 3, 3),
                        new AdditionalTasks("nameAdditionalTasks 1", 2, 4),
                        new AdditionalTasks("nameAdditionalTasks 2", 1, 1),
                };
                Arrays.sort(additionalTasks1);
                System.out.println("AdditionalTasks \n ");
                System.out.println(Arrays.toString(additionalTasks1));
                break;
            case 2:

                AdditionalTasks[] additionalTasks2 = new AdditionalTasks[]{
                        new AdditionalTasks("nameAdditionalTasks 3", 3, 3),
                        new AdditionalTasks("nameAdditionalTasks 1", 4, 2),
                        new AdditionalTasks("nameAdditionalTasks 2", 1, 1),
                };
                Arrays.sort(additionalTasks2);
                System.out.println("AdditionalTasks \n ");
                System.out.println(Arrays.toString(additionalTasks2));
                break;
            case 3:
                AdditionalTasksComparator additionalTasksComparator = new AdditionalTasksComparator() {
                };
                SortedSet<AdditionalTasks> nameAdditionalTasks = new TreeSet<>(additionalTasksComparator);
                nameAdditionalTasks.add(new AdditionalTasks("nameAdditionalTasks 3", 3, 3));
                nameAdditionalTasks.add(new AdditionalTasks("nameAdditionalTasks 1", 2, 5));
                nameAdditionalTasks.add(new AdditionalTasks("nameAdditionalTasks 2", 1, 2));
                nameAdditionalTasks.forEach(System.out::println);
                break;


        }


        return false;
    }

    public int getBOXES() {
        return BOXES;
    }

    public AdditionalTasks[] getAdditionalTasks() {
        return additionalTasks;
    }

    @Override
    public int getArray(int index) {
        return 0;
    }

    @Override
    public String toString() {
        return "AdditionalTasksRepository{" +
                "BOXES = " + BOXES +
                ", additionalTasks = " + Arrays.toString(additionalTasks) +
                '}';
    }
}
