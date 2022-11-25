package com.onlineschool;

public enum Role {

    TEACHER("Name","Second Name Teacher"),
    STUDENT("Name","Second Name Student");

        private String name;
        private String secondName;
private
        Role(String name,String secondName) {
            this.name= name;
            this.secondName= secondName;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
