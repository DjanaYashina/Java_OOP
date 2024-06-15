package org.example.oop_dz3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        List<Student> studentList = controller.getSortedStudentList();
        System.out.println("Сортированный список студентов по ID");
        for (Student student: studentList) {
            System.out.println(student);
        }
        System.out.println();
        List<Student> studentList2 = controller.getSortedStudentByFIO();
        System.out.println("Сортированный список студентов по ФИО");
        for (Student student: studentList2) {
            System.out.println(student);
        }

    }

//        List<Student> list = new ArrayList<>(Arrays.asList(
//                new Student(1L, "Иванов", "Иван", "Иванович"),
//                new Student(2L, "Петров", "Петр", "Петрович"),
//                new Student(3L, "Сергеев", "Сергей", "Сергеевич")
//        ));
//        System.out.println(list);
//        Collections.sort(list);
//
//        list.sort(new StudentComparator());
//
//        StudentGroup studentGroup = new StudentGroup(list);
//        for (Student student : studentGroup) {
//            System.out.println(student);
//        }
//    }
//
//    public static void Iterator(StudentGroup studentGroup){
//        StudentGroupIterator groupIterator = new StudentGroupIterator(studentGroup);
//        while (groupIterator.hasNext()){
//            System.out.println(groupIterator.next());
//        }
//    }
}
