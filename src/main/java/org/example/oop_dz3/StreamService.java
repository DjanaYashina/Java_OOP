package org.example.oop_dz3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {
    private final List<Stream> streamList = List.of(
            new Stream(List.of(
                    new StudentGroup(List.of(
                            new Student(0L, "Белов","Олег", "Сергеевич"),
                            new Student(3L, "Сидоров","Дмитрий", "Андреевич"),
                            new Student(2L, "Иванов","Сергей", "Дмитриевич"),
                            new Student(1L, "Сергеев", "Сергей", "Сергеевич")
                    ))
            )),
            new Stream(List.of(
                    new StudentGroup(List.of(
                            new Student(0L, "Белов","Олег", "Сергеевич"),
                            new Student(3L, "Сидоров","Дмитрий", "Андреевич"),
                            new Student(2L, "Иванов","Сергей", "Дмитриевич"),
                            new Student(1L, "Сергеев", "Сергей", "Сергеевич")
                    ))
            ))
    );

    public List<Stream> getSortedStreamByCount() {
        List<Stream> list = new ArrayList<>(streamList);
        list.sort(new StreamComparator());
        return list;
    }




//           public void sortStreams(List<Stream> streams) {
//            Collections.sort(streams, new StreamComparator());
//            streams.sort(new StreamComparator());
}
