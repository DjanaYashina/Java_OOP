package org.example.oop_dz4.controller;

import org.example.oop_dz4.model.Stream;
import org.example.oop_dz4.model.Student;
import org.example.oop_dz4.service.StreamService;
import org.example.oop_dz4.service.StudentGroupService;
import org.example.oop_dz4.view.StudentView;
import org.example.oop_dz4.view.UserView;

import java.util.List;

public class StudentController implements UserController<Student>{
    private final StudentGroupService studentGroupService = new StudentGroupService();

    private final StreamService streamService = new StreamService();

    /**
     * Теперь доступ к методу вывода списка учителей в консоль осуществляется через интерфейс UserController
     */
    private final UserView<Student> studentView = new StudentView();

    public void removeStudentByFIO(String firstName, String lastName, String middleName){
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }
    public List<Student> getSortedStudentList() {
        List<Student> sortedStudentList = studentGroupService.getSortedStudentList();
        studentView.sendOnConsole(sortedStudentList);
        return sortedStudentList;
    }
    public List<Student> getSortedStudentByFIO() {
        List<Student> sortedStudentByFIO = studentGroupService.getSortedStudentByFIO();
        studentView.sendOnConsole(sortedStudentByFIO);
        return sortedStudentByFIO;
    }

    public List<Stream> getSortedStreamByCount() {
        return streamService.getSortedStreamByCount();
    }

    @Override
    public void create(String firstName, String lastName, String middleName) {
        studentGroupService.createStudent(firstName, lastName,middleName);
    }

    @Override
    public void edit(Long sudentId, String firstName, String lastName, String middleName) {
        studentGroupService.editStudent(sudentId, firstName, lastName, middleName);
    }
    @Override
    public List<Student> getList() {
        List<Student> studentList = studentGroupService.getSortedStudentList();
        studentView.sendOnConsole(studentList);
        return studentList;
    }


//    public void sortStreams(List<Stream> streams) {
//        streamService.sortStreams(streams);
//    }
}
