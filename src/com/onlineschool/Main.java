package com.onlineschool;

import com.onlineschool.models.Log;
import com.onlineschool.models.Person;
import com.onlineschool.models.Role;
import com.onlineschool.repository.ControlWork;
import com.onlineschool.repository.LogRepository;


import java.util.*;


public class Main {

    public static void main(String[] args) throws InterruptedException {
//журнал роботи програми класс Log
        System.out.println("Storage Log:");
        LogRepository.logAll();

        {
            List<Integer> taskWork = new ArrayList<>();
            taskWork.add(1);
            taskWork.add(2);
            taskWork.add(3);
            taskWork.add(4);
            taskWork.add(5);
            taskWork.add(6);
            taskWork.add(7);
            taskWork.add(8);
            taskWork.add(9);
            taskWork.add(10);
            List<Person> AI1 = new ArrayList<>(10);
            AI1.add(0, new Person(Role.STUDENT("перший ")));
            AI1.add(1, new Person(Role.STUDENT("другий ")));
            AI1.add(2, new Person(Role.STUDENT("третій ")));
            AI1.add(3, new Person(Role.STUDENT("четвертий ")));
            AI1.add(4, new Person(Role.STUDENT("пятий ")));
            AI1.add(5, new Person(Role.STUDENT("шостий ")));
            AI1.add(6, new Person(Role.STUDENT("сьомий ")));
            AI1.add(7, new Person(Role.STUDENT("восьмий ")));
            AI1.add(8, new Person(Role.STUDENT("девятий ")));
            AI1.add(9, new Person(Role.STUDENT("десятий ")));
            {

                // перевірка random чисел на повторюваність
            int k;  //число завдання, яке записуємо у масив random чисел
            int y;  //якщо y = 1 не записуємо у arraySecondW; якщо y = 0 записуємо у arraySecondW
            int x;  //кількість раз вибору random чисел
            int tW; //число завдання після random
            int p = -1; // індекс arraySecondW
            int[] arraySecondW = new int[11];
            Random random = new Random();
            for (int i = 0; i < 1000000; i++) {          // можлива кількість перевірок
                y = 0;
                for (x = 0; x < 10; x++) {

                    tW = 1 + random.nextInt(10);  //random для завдання

                    for (k = 1; k < 11; k++)
                        if (tW == arraySecondW[k])      //номер завдання,не записуємо в новий масив
                            y = 1;

                    if (y == 0) {                       //номер завдання,записуємо в новий масив
                        p++;
                        arraySecondW[p] = tW;
                        break;
                    }
                }
            }

            int i = 0;
            // студент 1 обрав завдання
            ControlWork t1 = new ControlWork(1, Collections.singletonList(AI1.get(0)),
                    "завдання студента 1 AI1.txt ", "t1 ");
            try {
                System.out.println("студент: " + AI1.get(0));

                t1.start();
                i++;
            } catch (NullPointerException e) {
                Log.warning(" пустий потік ");

            }

            System.out.println(" обрав завдання = " + arraySecondW[i]);
            // студент 2 обрав завдання
            ControlWork t2 = new ControlWork(2, Collections.singletonList(AI1.get(1)),
                    "завдання студента 2 AI2.txt ", "t2 ");
            try {

                System.out.println("студент: " + AI1.get(1));
                t2.start();
                i++;
            } catch (NullPointerException e) {
                Log.warning(" пустий потік ");
            }


            System.out.println(" обрав завдання = " + arraySecondW[i]);

            ControlWork t3 = new ControlWork(3, Collections.singletonList(AI1.get(2)),
                    "завдання студента 3 AI3.txt ", "t3 ");
            try {
                System.out.println("студент: " + AI1.get(2));
                t3.start();
                i++;
            } catch (NullPointerException e) {
                Log.warning(" пустий потік ");
            }
            System.out.println(" обрав завдання = " + arraySecondW[i]);
            ControlWork t4 = new ControlWork(4, Collections.singletonList(AI1.get(3)),
                    "завдання студента 4 AI4.txt ", "t4 ");
            try {
                System.out.println("студент: " + AI1.get(3));
                t4.start();
                i++;
            } catch (NullPointerException e) {
                Log.warning(" пустий потік ");
            }
            System.out.println(" обрав завдання = " + arraySecondW[i]);
            ControlWork t5 = new ControlWork(5, Collections.singletonList(AI1.get(4)),
                    "завдання студента 5 AI5.txt ", "t5 ");
            try {
                System.out.println("студент: " + AI1.get(4));
                t5.start();
                i++;
            } catch (NullPointerException e) {
                Log.warning(" пустий потік ");
            }
            System.out.println(" обрав завдання = " + arraySecondW[i]);
            ControlWork t6 = new ControlWork(6, Collections.singletonList(AI1.get(5)),
                    "завдання студента 6 AI6.txt ", "t6 ");
            try {
                System.out.println("студент: " + AI1.get(5));

                t6.start();
                i++;
            } catch (NullPointerException e) {
                Log.warning(" пустий потік ");

            }

            System.out.println(" обрав завдання = " + arraySecondW[i]);
            ControlWork t7 = new ControlWork(7, Collections.singletonList(AI1.get(6)),
                    "завдання студента 7 AI7.txt ", "t7 ");
            try {
                System.out.println("студент: " + AI1.get(6));

                t7.start();
                i++;
            } catch (NullPointerException e) {
                Log.warning(" пустий потік ");

            }

            System.out.println(" обрав завдання = " + arraySecondW[i]);
            ControlWork t8 = new ControlWork(8, Collections.singletonList(AI1.get(7)),
                    "завдання студента 8 AI8.txt ", "t8 ");
            try {
                System.out.println("студент: " + AI1.get(7));

                t8.start();
                i++;
            } catch (NullPointerException e) {
                Log.warning(" пустий потік ");

            }

            System.out.println(" обрав завдання = " + arraySecondW[i]);
            ControlWork t9 = new ControlWork(9, Collections.singletonList(AI1.get(8)),
                    "завдання студента 9 AI9.txt ", "t9 ");
            try {
                System.out.println("студент: " + AI1.get(8));

                t9.start();
                i++;
            } catch (NullPointerException e) {
                Log.warning(" пустий потік ");

            }

            System.out.println(" обрав завдання = " + arraySecondW[i]);
            ControlWork t10 = new ControlWork(10, Collections.singletonList(AI1.get(9)),
                    "завдання студента 10 AI10.txt ", "t10 ");
            try {
                System.out.println("студент: " + AI1.get(9));

                t10.start();
                ++i;
            } catch (NullPointerException e) {
                Log.warning(" пустий потік ");

            }
            System.out.println(" обрав завдання = " + arraySecondW[i]);
            System.out.println("Почали виконання завдань 12сек ");
            Thread.sleep(12000);
            }
        }
    }
}






























































