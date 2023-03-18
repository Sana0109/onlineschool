package com.onlineschool.repository;

import com.onlineschool.models.Person;
import com.onlineschool.models.Role;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

import static java.lang.Thread.sleep;


public class ControlWork implements Runnable {
    private final List<Person> AI1;// масив що записується
    private final String fileNameTask;//імя файлу
    private final String nameThread; //імя потоку
    private final Thread t;//посилання на поточний потік


    private final int id;

    public ControlWork(int id, List<Person> AI1, String fileNameTask, String nameThread) {
        this.AI1 = AI1;
        this.fileNameTask = fileNameTask;
        this.nameThread = nameThread;
        t = new Thread(this, "save thread");
        this.id = id;
    }

    public List<Person> getAI1() {
        return AI1;
    }
    public static int m = 0;

    public void number() {
        m++;

    }

    @Override
    public String toString() {
        return "ControlWork{" +
                "AI1=" + AI1 +
                ", fileNameTask='" + fileNameTask + '\'' +
                ", nameThread='" + nameThread + '\'' +
                ", t=" + t +

                ", id=" + id +
                '}';
    }

    @Override
    public synchronized void run() {
        try {

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


            FileOutputStream fileOutputStream = new FileOutputStream(fileNameTask);
            PrintStream printStream = new PrintStream(fileOutputStream);

            for (int i = 0; i < AI1.size();) {

                Random r = new Random();
                int min = 8000;
                int max = 14000;
                int randomNumber = r.nextInt(max - min + 1) + min;

                sleep(randomNumber);
                {
                    number();
                    System.out.println(m + " місце " + Arrays.toString(getAI1().toArray()) + " час виконання " + "cтудентом = " + randomNumber);

                }

                if (randomNumber > 12000)
                    System.out.println(" не вклався в час " + Arrays.toString(getAI1().toArray()) + " час виконання завдання " + "cтудентом більше 12сек =" + " " + randomNumber);

                printStream.close();
                fileOutputStream.close();

                break;
            }

        } catch (InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void start() {

        t.start();
    }

}
