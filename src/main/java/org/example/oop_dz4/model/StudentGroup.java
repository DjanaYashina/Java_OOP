package org.example.oop_dz4.model;



import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentGroup extends UserGroup<Student>{
    private final List<Student> studentList = new ArrayList<>();

    @Override
    public List<Student> getList() {
        return studentList;
    }

    @Override
    public void createUser(String firstName, String lastName, String middleName) {
        studentList.add(new Student(new Random().nextLong(), firstName, lastName, middleName));
    }

}
