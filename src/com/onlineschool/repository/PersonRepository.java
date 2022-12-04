package com.onlineschool.repository;

import com.onlineschool.models.Role;
import com.onlineschool.models.Person;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class PersonRepository extends FacultyRepository {
    private int BOXES = 10;
    private Person[] people = new Person[BOXES];

    public int getBOXES() {
        return BOXES;
    }

    public Person[] getPeople() {
        return people;
    }

    public static Person createNewRole(int ID, int courseID, Role role) {
        return new Person(ID, courseID, role);
    }

    public static void nameFirstStudentPattern() {
        Scanner scanner = new Scanner(in);

        System.out.println("enter First Name Student");
        String nameFirstS = "\\D[a-zA-Z]\\D+";
        Pattern ptrn = Pattern.compile(nameFirstS);
        String nameFirstStudent = scanner.next();
        Matcher matcher = ptrn.matcher(nameFirstStudent);
        System.out.println("First Name Student " + nameFirstStudent + "\n" + matcher.find());

    }

    public static void nameSecondStudent() {
        System.out.println("enter Second Name Student");
        Scanner scanner = new Scanner(in);
        String nameSecondS = "\\D[a-zA-Z]\\D+";
        Pattern ptrn1 = Pattern.compile(nameSecondS);
        String nameSecondStudent = scanner.next();
        Matcher matcher1 = ptrn1.matcher(nameSecondStudent);
        System.out.println("Second Name Student " + nameSecondStudent + "\n" + matcher1.find());
    }

    public static void phonePattern() {
        Scanner scanner = new Scanner(in);
        String numberPhone = "^\\(?(\\d{3}\\)?[- ]?(\\d{3})[- ]?(\\d{4})$)";
        Pattern ptrn2 = Pattern.compile(numberPhone);
        System.out.println("enter phone number (xxx)-xxx-xxxx ");
        String numberP = scanner.next();
        Matcher matcher2 = ptrn2.matcher(numberP);
        System.out.println("Phone number " + numberP + "\n" + matcher2.find());

    }

    public static void emailPattern() {
        Scanner scanner = new Scanner(in);
        String email = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";
        Pattern ptrn3 = Pattern.compile(email);
        System.out.println("enter email x@x.x.x");
        String emailP = scanner.next();
        Matcher matcher3 = ptrn3.matcher(emailP);
        System.out.println("Email " + emailP + "\n" + matcher3.find());
    }

    @Override
    public String toString() {
        return "PersonRepository" +
                "BOXES=" + BOXES +
                ", people=" + Arrays.toString(people)
                ;
    }
}
