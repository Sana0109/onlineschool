package com.onlineschool;

public enum Role {

    TEACHER("nameTeacher1") ;


        private String nameTeacher;

        Role(String nameTeacher) {
            this.nameTeacher = nameTeacher;
        }

/*STUDENT("nameStudent");
        private String nameStudent;
    Role(String nameStudent){
        this.nameStudent = nameStudent;
    }
*/

    @Override
    public String toString() {
        return "Role{" +
                "nameTeacher='" + nameTeacher + '\'' +
                '}';
    }
}
