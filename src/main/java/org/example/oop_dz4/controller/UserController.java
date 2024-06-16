package org.example.oop_dz4.controller;

import org.example.oop_dz4.model.Teacher;
import org.example.oop_dz4.model.User;

import java.util.List;

/**
 * Класс UserController определяет, что все наследники этого интерфейса будут уметь создавать,
 * редактировать и возвращать список пользователе типа T.
 * @param <T> - обобщенны тип наследуемый от User
 */

public interface UserController<T extends User> {
    void create(String firstName, String lastName, String middleName);
    void edit(Long id, String firstName, String lastName, String middleName);
    List<T> getList ();
}
