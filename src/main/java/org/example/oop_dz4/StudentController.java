package org.example.oop_dz4;

import java.util.List;

public class StudentController implements UserController<Student>{
    private final StudentGroupService studentGroupService = new StudentGroupService();

    private final StreamService streamService = new StreamService();
    private final StudentView studentView = new StudentView();

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


//    public void sortStreams(List<Stream> streams) {
//        streamService.sortStreams(streams);
//    }
}
