package org.example.oop_dz4.model;

import java.util.Random;

public class Teacher extends User {
    @Override
    public long getID() {
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
