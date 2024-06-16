package org.example.oop_dz4.service;

import org.example.oop_dz4.model.User;
import org.example.oop_dz4.model.UserGroup;
import org.example.oop_dz4.utils.SortHelper;
import org.example.oop_dz4.model.Student;
import org.example.oop_dz4.model.StudentGroup;

import java.util.*;

public class StudentGroupService {
    /**
     * теперь доступ осуществляется через интерфейс UserGroup
     */
    private final UserGroup<Student> studentGroup = new StudentGroup();
    private final SortHelper<Student> sortHelper = new SortHelper<Student>();
    public void removeStudentByFIO(String firstName, String lastName, String middleName){
        Iterator<User> iterator = studentGroup.iterator();
        while (iterator.hasNext()){
            User user = iterator.next();
            if (user.getFirstName().equals(firstName) && user.getLastName().equals(lastName) && user.getMiddleName().equals(middleName)){
                iterator.remove();;
            }
        }
    }

    public List<Student> getSortedStudentList() {
        //Поскольку метод принимает на входе параметр UserGroup, то мы можем передать в этот метод
        // поле StudentGroup, который является объектом StudentGroup
        return sortHelper.getSortedList(studentGroup);
    }

    public List<Student> getSortedStudentByFIO() {
        return sortHelper.getSortedListByFIO(studentGroup);
    }
    public void createStudent(String firstName, String lastName, String middleName) {
        studentGroup.createUser(firstName, lastName,middleName);
    }

    public void editStudent(Long sudentId, String firstName, String lastName, String middleName) {
        studentGroup.editUser(sudentId, firstName, lastName, middleName);
    }
}
