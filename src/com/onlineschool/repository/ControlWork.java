package com.onlineschool.repository;

public class ControlWork implements Runnable{
    private String task;

    public ControlWork() {
        this.task = task;
    }


    public synchronized void printControlWork() {

        String threadName = Thread.currentThread().getName();
        System.out.println("---task---");
        //if (Thread.currentThread().getName().equals("first thread"))
        Thread.yield();
        //System.out.println(threadName + "lock" + Thread.holdsLock(this));
        System.out.println(threadName + "task " + task);
        System.out.println("---finish2---");


    }

    public String getTask() {
        return task;
    }

    @Override
    public void run() {
        printControlWork();
    }

}
