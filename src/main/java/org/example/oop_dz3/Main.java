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

}
