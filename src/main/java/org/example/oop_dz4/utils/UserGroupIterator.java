package org.example.oop_dz4.utils;

import org.example.oop_dz4.model.Student;
import org.example.oop_dz4.model.StudentGroup;
import org.example.oop_dz4.model.User;
import org.example.oop_dz4.model.UserGroup;

import java.util.Iterator;
import java.util.List;
// чтобы не реалезовывать такой же итератор для TeacherGroup,
//интерфейс StudentGroupIterator был переделан в UserGroupIterator, который теперь общий
//для студентов и учетелей
public class UserGroupIterator implements Iterator<User> {

    private int count;

    public UserGroupIterator (UserGroup userGroup) {
        this.count = 0;
        this.userList = userGroup.getList();
    }

    private final List<Student> userList;
    @Override
    public boolean hasNext() {
        return count < userList.size()-1;
    }

    @Override
    public User next() {
        if (!hasNext()){
            return null;
        }
        count++;
        return userList.get(count);
    }

    @Override
    public void remove() {
        userList.remove(count);
    }

}
