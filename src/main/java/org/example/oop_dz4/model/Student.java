package org.example.oop_dz4.model;

public class Student extends User implements Comparable<Student> {
    private final long studentID;

    public Student(Long studentID, String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
        this.studentID = studentID;
    }
    @Override
    public long getID() {
        return studentID;
    }

    @Override
    public int compareTo(Student o) {
        return Long.compare(studentID, o.getID());
    }
    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", middleName='" + getMiddleName() + '\'' +
                '}';
    }
}
