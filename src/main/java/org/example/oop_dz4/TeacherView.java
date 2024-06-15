package org.example.oop_dz4;

import java.util.List;

public class TeacherView implements UserView <Teacher> {

    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teacher: list){
            System.out.println(teacher);
        }
    }

    public void printOnConsole(org.example.oop_dz5.model.Teacher teacher) {
        System.out.println(teacher);
    }
}
