package org.example.oop_dz3;

import java.util.List;

public class Controller {
    private final StudentGroupService studentGroupService = new StudentGroupService();

    private final StreamService streamService = new StreamService();

    public void removeStudentByFIO(String firstName, String lastName, String middleName){
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }
    public List<Student> getSortedStudentList() {
        return studentGroupService.getSortedStudentList();
    }
    public List<Student> getSortedStudentByFIO() {
        return studentGroupService.getSortedStudentByFIO();
    }

    public List<Stream> getSortedStreamByCount() {
        return streamService.getSortedStreamByCount();
    }


//    public void sortStreams(List<Stream> streams) {
//        streamService.sortStreams(streams);
//    }
}
