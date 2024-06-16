package org.example.oop_dz4.view;

import org.example.oop_dz4.model.User;

import java.util.List;

public interface UserView <T extends User>{
    void sendOnConsole(List<T> list);
}
