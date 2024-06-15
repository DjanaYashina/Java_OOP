package org.example.oop_dz3;

import java.util.*;

public class StudentGroupService {

    private final StudentGroup studentGroup = new StudentGroup(List.of(
            new Student(0L, "Белов","Олег", "Сергеевич"),
            new Student(3L, "Сидоров","Дмитрий", "Андреевич"),
            new Student(2L, "Иванов","Сергей", "Дмитриевич"),
            new Student(1L, "Сергеев", "Сергей", "Сергеевич")
    ));
    public void removeStudentByFIO(String firstName, String lastName, String middleName){
        Iterator<Student> iterator = studentGroup.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName) && student.getMiddleName().equals(middleName)){
                iterator.remove();;
            }
        }
    }

    public List<Student> getSortedStudentList() {
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        Collections.sort(studentList);
        return studentList;
    }

    public List<Student> getSortedStudentByFIO() {
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        studentList.sort(new StudentComparator());
        return studentList;
    }
}
