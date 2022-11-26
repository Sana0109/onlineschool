package com.onlineschool;

public enum Role {

    TEACHER("Name First Teacher", "Second Name Teacher"),
    STUDENT("Name First Student", "Second Name Student");

    private String nameFirst;
    private String secondName;

    private Role(String nameFirst, String secondName) {
        this.nameFirst = nameFirst;
        this.secondName = secondName;
    }

    public String getName() {
        return nameFirst;
    }

    public void setName(String name) {
        this.nameFirst = nameFirst;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "name First = '" + nameFirst + '\'' +
                " second Name = '" + secondName + '\'' ;
    }
}
