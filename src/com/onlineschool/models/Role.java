package com.onlineschool.models;

public enum Role {

    TEACHER("Name First Teacher", "Second Name Teacher",
            "Phone", "Email"),
    STUDENT("Name First Student", "Second Name Student",

            "Phone", "Email");

    private String nameFirst;
    private String secondName;
    private String phone = "Phone";
    private String email = "Email";

    Role(String nameFirst, String secondName, String phone, String email) {
        this.nameFirst = nameFirst;
        this.secondName = secondName;
        this.phone = phone;
        this.email = email;
    }




     Role(String secondName) {
        this.secondName = secondName;
    }

    public static String TEACHER(String secondName) {return secondName;
    }



    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public String getSecondName(String secondName) {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "name First = '" + nameFirst + '\'' +
                " second Name = '" + secondName + '\'' + "\n Phone " + phone + "\n Email " + email;
    }
}
