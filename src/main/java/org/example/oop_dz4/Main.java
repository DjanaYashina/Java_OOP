package org.example.oop_dz4;

import org.example.oop_dz4.controller.StudentController;
import org.example.oop_dz4.controller.UserController;
import org.example.oop_dz4.model.Student;
import org.example.oop_dz4.model.User;


public class Main {
    public static void main(String[] args) {

        // Переменная userController определяется только один раз при создании,
        // а остальной код универсален
        UserController<Student> userController = new StudentController();
        //UserController<Teacher> userController = new TeacherController();
        userController.create("Ivanov", "Ivan", "Ivanovich");
        userController.create("Sidorov", "Ivan", "Petrovich");
        userController.create("Petrova", "Ilona", "Ivanovna");
        userController.create("Rusov", "Oleg", "Sergeevich");
        User user = userController.getList().get(2);
        userController.edit(user.getID(),"Shuvalova","Ilona", "Ivanovna");
        System.out.println();
        userController.getList();
    }

}
