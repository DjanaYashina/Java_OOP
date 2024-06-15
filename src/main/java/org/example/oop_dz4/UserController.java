package org.example.oop_dz4;

public interface UserController<T extends User> {
    void create(String firstName, String lastName, String middleName);
}
