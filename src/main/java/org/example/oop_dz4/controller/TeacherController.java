package org.example.oop_dz4.controller;


import org.example.oop_dz4.model.Teacher;
import org.example.oop_dz4.service.TeacherService;
import org.example.oop_dz4.view.TeacherView;
import org.example.oop_dz4.view.UserView;

import java.util.List;

public class TeacherController implements UserController<Teacher>{
    private final TeacherService teacherService = new TeacherService();

    /**
     * Теперь доступ к методу вывода списка учителей в консоль осуществляется через интерфейс UserController
     */

    private final UserView<Teacher> teacherView = new TeacherView();
    @Override
    public void create(String firstName, String lastName, String middleName) {
        teacherService.createTeacher(firstName, lastName, middleName);


    }
    @Override
    public void edit(Long teacherId, String firstName, String lastName, String middleName) {
        teacherService.editTeacher(teacherId, firstName, lastName, middleName);
    }
    @Override
    public List<Teacher> getList() {
        List<Teacher> teacherList = teacherService.getTeacherList();
        teacherView.sendOnConsole(teacherList);
        return teacherList;
    }
    public List<Teacher> getSortedTeacherList() {
        List<Teacher> sortedStudentList = teacherService.getSortedTeacherList();
        teacherView.sendOnConsole(getSortedTeacherList());
        return sortedStudentList;
    }
    public List<Teacher> getSortedTeacherByFIO() {
        List<Teacher> sortedStudentByFIO = teacherService.getSortedTeacherByFIO();
        teacherView.sendOnConsole(getSortedTeacherByFIO());
        return sortedStudentByFIO;
    }
}
