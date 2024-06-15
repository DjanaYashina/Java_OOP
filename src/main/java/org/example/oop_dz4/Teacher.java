package org.example.oop_dz4;

import java.util.Random;

public class Teacher extends User{
    public Long getTeacherID() {
        return teacherID;
    }

    private final Long teacherID;
    public Teacher(String firstName, String lastName, String middleName){
        super(firstName, lastName,middleName);
        teacherID = new Random().nextLong();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID=" + teacherID +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", middleName='" + getMiddleName() + '\'' +
                '}';
    }
}
