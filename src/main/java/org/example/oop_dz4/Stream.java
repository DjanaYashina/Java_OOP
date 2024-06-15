package org.example.oop_dz4;

import java.util.Iterator;
import java.util.List;


public class Stream implements Iterator<StudentGroup>,Comparable<Stream>{
    final List<StudentGroup> studentGroupList;


    private int count;

    public Stream(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
        count = 0;
    }

    @Override
    public boolean hasNext() {
        return count < studentGroupList.size()-1;
    }

    @Override
    public StudentGroup next() {
        if (!hasNext()){
            return null;
        }
        count++;
        return studentGroupList.get(count);
    }

    @Override
    public void remove() {
        studentGroupList.remove(count);
    }


    @Override
    public int compareTo(Stream o) {
        return Integer.compare(studentGroupList.size(), o.studentGroupList.size());
    }
}

