package com.onlineschool.repository;

import com.onlineschool.models.Log;

import java.util.*;

public class ControlWork implements Runnable{
    private String task;

    public ControlWork(ControlWork controlWork, ControlWork work, ControlWork controlWork1, ControlWork work1, ControlWork controlWork2, ControlWork work2, ControlWork controlWork3, ControlWork work3, ControlWork controlWork4, ControlWork work4, ControlWork controlWork5) {
        this.task = task;
    }


    public synchronized void printControlWork() {

        String threadName = Thread.currentThread().getName();
        System.out.println("---task---");
       // if (Thread.currentThread().getName().equals("first thread"))
       // Thread.yield();
        //System.out.println(threadName + "lock" + Thread.holdsLock(this));
        System.out.println(threadName + "task " + task);
        System.out.println("---finish2---");


    }
public static void choseTask() {
    System.out.println("По черзі виберіть завдання від 1 до 10");
   // Random task = new Random();
    Scanner scanner = new Scanner(System.in);
    List<Integer> taskWork = new ArrayList<>(10);
    taskWork.add(2);
    taskWork.add(7);
    taskWork.add(1);
    taskWork.add(8);
    taskWork.add(3);
    taskWork.add(10);
    taskWork.add(6);
    taskWork.add(5);
    taskWork.add(4);
    taskWork.add(9);


    for (int controlWork = 0; controlWork < 11; controlWork++) {

        controlWork = scanner.nextInt();
        int taskStudent = 0;
        // for (taskStudent = 1; taskStudent < 12; ) {
        // taskStudent = 1 + task.nextInt(10);
        //int workTask = taskWork.get(taskStudent);
        //if (taskStudent == (int) ((Math.random()) * 10 + 1)) ;
        System.out.println("студенту " + controlWork + " Випало Завдання - " + taskWork.get(taskStudent));
        taskWork.remove(taskStudent);





    }
}
   /* for (int controlWork = 0; controlWork <= 10; controlWork++) {

        controlWork = scanner.nextInt();
        int taskStudent ;
        do {
            taskStudent = task.nextInt(10);
        }
        while (controlWorks.contains(taskStudent));
        controlWorks.add(taskStudent);
        if (controlWorks.size() == 1) controlWorks.removeFirst();

        System.out.println("студенту " + controlWork + " Випало Завдання - " + taskStudent);
    }*/







 /*    for (int controlWork = 1; controlWork <=10 ; controlWork++) {
        controlWork = scanner.nextInt();

         int min =1 ;
         int max =10 ;
         int first = max-min;
         Random task = new Random();
         int i = task.nextInt(first+1);
         i+= min;
         System.out.println("студенту " + controlWork+ " Випало Завдання - " + i);
         }
*/

       /*int  n = 10;//кількість завдань
        int student = task.nextInt(n);

        int taskStudent = (student  + task.nextInt(n - 1)) % n;
        for (int i = 1; i <=10; i++) {
            int r = (student +  task.nextInt(n - 2)) % n;
            if (r == taskStudent)
                r = (student + n - 1) % n;
            student = taskStudent;
            taskStudent = r;}
        System.out.println("студенту " + controlWork+ " Випало Завдання - " + taskStudent);
    }*/

   /* do {
        taskStudent = task.nextInt(10);}
    while (controlWorks.contains(taskStudent)) ;
    controlWorks.add(taskStudent);
    if (controlWorks.size() == 1) controlWorks.removeFirst();
    System.out.println("студенту " + controlWork+ " Випало Завдання - " + taskStudent);
    int taskStudent1;
    int controlWork1 = scanner.nextInt();
    do {

        taskStudent1 = task.nextInt(10);}
    while (controlWorks.contains(taskStudent1)) ;
    controlWorks.add(taskStudent1);
    if (controlWorks.size() == 1) controlWorks.removeFirst();

    System.out.println("студенту " + controlWork1+ " Випало Завдання - " + taskStudent1);

    int taskStudent2;
    int controlWork2 = scanner.nextInt();
  */
      /*  for (int controlWork = 0; controlWork <= 10; controlWork++) {

            controlWork = scanner.nextInt();
            int taskStudent;
            do {
                taskStudent = task.nextInt(10);
            }
            while (controlWorks.contains(taskStudent));
            controlWorks.add(taskStudent);
            if (controlWorks.size() == 1) controlWorks.removeFirst();

            System.out.println("студенту " + controlWork + " Випало Завдання - " + taskStudent);
        }*/
 /*   int taskStudent3;
    int controlWork3 = scanner.nextInt();
    do {

        taskStudent3 = task.nextInt(10);}
    while (controlWorks.contains(taskStudent3)) ;
    controlWorks.add(taskStudent3);
    if (controlWorks.size() == 1) controlWorks.removeFirst();

    System.out.println("студенту " + controlWork3+ " Випало Завдання - " + taskStudent3);


    int taskStudent4;
    int controlWork4 = scanner.nextInt();
    do {

        taskStudent4 = task.nextInt(10);}
    while (controlWorks.contains(taskStudent4)) ;
    controlWorks.add(taskStudent4);
    if (controlWorks.size() == 1) controlWorks.removeFirst();

    System.out.println("студенту " + controlWork4+ " Випало Завдання - " + taskStudent4);

    int taskStudent5;
    int controlWork5 = scanner.nextInt();
    do {

        taskStudent5 = task.nextInt(10);}
    while (controlWorks.contains(taskStudent5)) ;
    controlWorks.add(taskStudent5);
    if (controlWorks.size() == 1) controlWorks.removeFirst();

    System.out.println("студенту " + controlWork5+ " Випало Завдання - " + taskStudent5);

    int taskStudent6;
    int controlWork6 = scanner.nextInt();
    do {

        taskStudent6 = task.nextInt(10);}
    while (controlWorks.contains(taskStudent6)) ;
    controlWorks.add(taskStudent6);
    if (controlWorks.size() == 1) controlWorks.removeFirst();

    System.out.println("студенту " + controlWork6+ " Випало Завдання - " + taskStudent6);
    int taskStudent7;
    int controlWork7 = scanner.nextInt();
    do {

        taskStudent7 = task.nextInt(10);}
    while (controlWorks.contains(taskStudent7)) ;
    controlWorks.add(taskStudent2);
    if (controlWorks.size() == 1) controlWorks.removeFirst();

    System.out.println("студенту " + controlWork7+ " Випало Завдання - " + taskStudent7);*/


    public String getTask () {
        return task;
    }

    @Override
    public void run () {
        printControlWork();
    }
}

