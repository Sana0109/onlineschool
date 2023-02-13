package com.onlineschool.models;

public class Person implements Runnable {
    private Integer ID;
    private Integer courseID;
    private Role role;
    private String second_name;

    public Person(Integer ID, Integer courseID, Role role) {
        this.ID = ID;
        this.courseID = courseID;
        this.role = role;

    }

    public Person(int ID, int courseID, String second_name) {
        this.ID = ID;
        this.courseID = courseID;
        this.second_name = second_name;
    }

    public Person(Role role) {

        this.role = role;
    }

    public Person(String second_name) {

        this.second_name = second_name;
    }

    public String Person(String second_name) {
        return second_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(Integer courseID) {

        this.courseID = courseID;
    }

    public Role getRole() {
        return setRole(Role.TEACHER);
    }

    public Role setRole(Role role) {
        this.role = role;
        return role;
    }

    @Override
    public String toString() {
        return "Person{" +
                "second_name='" + second_name + '\'' +
                '}';
    }

    public synchronized void printPerson() {

        String threadName = Thread.currentThread().getName();
        System.out.println("---Student---");
        try{
            //if (Thread.currentThread().getName().equals("First thread"))
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println("error"+e.getMessage());
        }
       //if (Thread.currentThread().getName().equals("first thread"))
        //Thread.yield();
       System.out.println(threadName + "lock" + Thread.holdsLock(this));

        System.out.println(threadName + "second name 1 " + Role.STUDENT);
        System.out.println("---finish---");


    }

    @Override
    public void run() {
        printPerson();
    }
}