package org.example.oop_dz4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TeacherController teacherController = new TeacherController();
        teacherController.create("Ivanov", "Ivan", "Ivanovich");
        teacherController.create("Sidorov", "Ivan", "Petrovich");
        teacherController.create("Petrova", "Ilona", "Ivanovna");
        teacherController.create("Rusov", "Oleg", "Sergeevich");
        List<Teacher> teacherList = teacherController.getTeacherList();
        Teacher teacher = teacherList.get(2);
        teacherController.edit(teacher.getTeacherID(),"Shuvalova","Ilona", "Ivanovna");
        System.out.println();
        teacherController.getTeacherList();
    }

}
