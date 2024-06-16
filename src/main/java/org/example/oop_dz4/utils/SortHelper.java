package org.example.oop_dz4.utils;


import org.example.oop_dz4.model.User;
import org.example.oop_dz4.model.UserGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Этот класс отвечает за разные виды сортировки у UserGroup,
 * таким образом мы вынесли логику сортировки из сервисов
 */
public class SortHelper<T extends User> {
    public List<T> getSortedList(UserGroup userGroup) {
        List list = new ArrayList<>(userGroup.getList());
        Collections.sort(list);
        return list;
    }
    

    public List<T> getSortedListByFIO(UserGroup userGroup) {
        List list = new ArrayList<>(userGroup.getList());
        list.sort(new UserComparator<User>());
        return list;
    }
}
