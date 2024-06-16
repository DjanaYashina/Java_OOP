package org.example.oop_dz4.model;

import org.example.oop_dz4.utils.UserGroupIterator;
import java.util.Iterator;
import java.util.List;

/**
 * TeacherGroup и StudentGroup содержали методы, которые были вынесены
 * в общий абстрактный класс с общим типом
 * также реализация Iteredle была вынесена в обопщенный класс
 */
public abstract class UserGroup<T extends User> implements Iterable<User>{
    public abstract void createUser(String firstName, String lastName, String middleName);

    public void editUser(Long userId, String firstName, String lastName, String middleName) {
        for (T user: getList()) {
            if (userId == user.getID()) {
                user.setFirstName(firstName);
                user.setLastName(lastName);
                user.setMiddleName(middleName);
                break;
            }
        }
    }
    public abstract List<T> getList();
    public Iterator<User> iterator() {
        return new UserGroupIterator(this);
    }

}
