package org.example.oop_dz4.service;


import org.example.oop_dz4.model.Teacher;
import org.example.oop_dz4.model.TeacherGroup;
import org.example.oop_dz4.model.UserGroup;
import org.example.oop_dz4.utils.SortHelper;

import java.util.List;

public class TeacherService {
    private final UserGroup<Teacher> teacherGroup = new TeacherGroup();

    private final SortHelper<Teacher> sortHelper = new SortHelper<Teacher>();
    public void createTeacher(String firstName, String lastName, String middleName) {
        teacherGroup.createUser(firstName, lastName, middleName);
    }

    public void editTeacher(Long teacherId, String firstName, String lastName, String middleName) {
        teacherGroup.editUser(teacherId, firstName, lastName, middleName);
    }

    public List<Teacher> getTeacherList() {
        return teacherGroup.getList();
    }
    public List<Teacher> getSortedTeacherList() {
        //Поскольку метод принимает на входе параметр UserGroup, то мы можем передать в этот метод
        // поле TeacherGroup, который является объектом TeacherGroup
        return sortHelper.getSortedList(teacherGroup);
    }

    public List<Teacher> getSortedTeacherByFIO() {
        return sortHelper.getSortedListByFIO(teacherGroup);
    }
}
