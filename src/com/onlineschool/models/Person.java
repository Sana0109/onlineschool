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

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Person(Integer ID) {
        this.ID = ID;
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

    public int Person() {
        return getID();
    }

    public synchronized void printPerson() throws InterruptedException {
        Person person = new Person(Role.STUDENT);
        //String threadName = Thread.currentThread().getName();
        System.out.println("---Start---");
 /*       try {
            //if (Thread.currentThread().getName().equals("First thread"))
            Thread.sleep(12000);
        } catch (InterruptedException e) {
            Log.error("error" + e.getMessage());
        }
*/

        //
/*
        Thread t1 = new Thread(person);
        t1.setName(" task for ");
        Thread.sleep(10000);
        t1.start();
        //if (Thread.currentThread().getName().equals(" first thread "))
           // Thread.yield();
        person.close();
        System.out.println(t1.getName() + " first " + Role.STUDENT.getSecondName());
        System.out.println("---finish---");
        Thread t2 = new Thread(person);
        t2.setName(" task for ");
        Thread.sleep(8000);
        t2.start();
        person.close();
        //if (Thread.currentThread().getName().equals(" second thread "))
           // Thread.yield();
        System.out.println(t2.getName() + " second " + Role.STUDENT.getSecondName());
        System.out.println("---finish---");
        Thread t3 = new Thread(person);
        t3.setName(" task for ");
        Thread.sleep(14000);
        t3.start();
        person.close();
        //if (Thread.currentThread().getName().equals(" third thread "))
           // Thread.yield();
        System.out.println(t3.getName() + " third " + Role.STUDENT.getSecondName());
        System.out.println("---finish---");
        Thread t4 = new Thread(person);
        t4.setName(" fourth thread for person ");
        Thread.sleep(9000);
        t4.start();
        person.close();
       // if (Thread.currentThread().getName().equals(" fourth thread "))
           // Thread.yield();
        System.out.println(t4.getName() + " fourth " + Role.STUDENT.getSecondName());
        System.out.println("---finish---");
        Thread t5 = new Thread(person);
        t5.setName(" fifth thread for person ");
        Thread.sleep(11500);
        t5.start();
        person.close();
      //  if (Thread.currentThread().getName().equals(" fifth thread "))
           // Thread.yield();
        System.out.println(t5.getName() + " fifth " + Role.STUDENT.getSecondName());
        System.out.println("---finish---");
        Thread t6 = new Thread(person);
        t6.setName(" sixth thread for person ");
        Thread.sleep(12000);
        t6.start();
        person.close();
       // if (Thread.currentThread().getName().equals(" sixth thread "))
           // Thread.yield();
        System.out.println(t6.getName() + " sixth " + Role.STUDENT.getSecondName());
        System.out.println("---finish---");
        Thread t7 = new Thread(person);
        t7.setName(" seventh thread for person ");
        Thread.sleep(13000);
        t7.start();
        person.close();
      //  if (Thread.currentThread().getName().equals(" seventh thread "))
          //  Thread.yield();
        System.out.println(t7.getName() + " seventh " + Role.STUDENT.getSecondName());
        System.out.println("---finish---");
        Thread t8 = new Thread(person);
        t8.setName(" eighth thread for person ");
        Thread.sleep(8500);
        t8.start();
        person.close();
       // if (Thread.currentThread().getName().equals(" eighth thread "))
           // Thread.yield();
        System.out.println(t8.getName() + " eighth " + Role.STUDENT.getSecondName());
        System.out.println("---finish---");
        Thread t9 = new Thread(person);
        t9.setName(" ninth thread for person ");
        Thread.sleep(8000);
        t9.start();
        person.close();
        //if (Thread.currentThread().getName().equals(" ninth thread "))
           // Thread.yield();
        System.out.println(t9.getName() + " ninth " + Role.STUDENT.getSecondName());
        System.out.println("---finish---");
        Thread t10 = new Thread(person);
        t10.setName(" tenth thread for person ");
        Thread.sleep(13500);
        t10.start();
        if (Thread.currentThread().getName().equals(" tenth thread "))
            Thread.yield();
        person.close();

        System.out.println(t10.getName() + " tenth " + Role.STUDENT.getSecondName());
        System.out.println("---finish---");
        Thread.enumerate(new Thread[]{t1});
        System.out.println(t1.getName()+Thread.activeCount());

    }

    volatile boolean close = false;

    @Override
    public void run() {
        while (!close)
            try {
                printPerson();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

    }

    public void close() {
        close = true;
    }

    public Thread currentThread() {
        return null;*/
    }

    @Override
    public void run() {

    }

    public void sleep(int i) {

    }

    public Person compareTo(Person person) {return person;
    }
}