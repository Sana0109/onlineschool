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

            Thread t1 = new Thread(person);
            t1.setName(" task for ");
        Thread.sleep(10000);
        t1.start();
        if (Thread.currentThread().getName().equals(" first thread "))
            Thread.yield();
        person.close();
        System.out.println(t1.getName()+ " first " + Role.STUDENT.getSecondName());
        System.out.println("---finish---");
            Thread t2 = new Thread(person);
            t2.setName(" task for 2");
        Thread.sleep(8000);
        t2.start();
        person.close();
        if (Thread.currentThread().getName().equals(" second thread "))
            Thread.yield();

        System.out.println(t2.getName()+" second " + Role.STUDENT.getSecondName());
        System.out.println("---finish---");
            Thread t3 = new Thread(person);
            t3.setName(" task for 3");
        Thread.sleep(14000);




            t3.start();
        person.close();
        if (Thread.currentThread().getName().equals(" third thread "))
            Thread.yield();
            System.out.println(t3.getName()+" third " + Role.STUDENT.getSecondName());
            System.out.println("---finish---");



        }
        //System.out.println(threadName + " lock " + Thread.holdsLock(this));


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
    public  void close (){
        close = true;
    }
}