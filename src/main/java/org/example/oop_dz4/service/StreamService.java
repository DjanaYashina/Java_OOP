package org.example.oop_dz4.service;

import org.example.oop_dz4.utils.StreamComparator;
import org.example.oop_dz4.model.Stream;

import java.util.ArrayList;
import java.util.List;

public class StreamService {
    private final List<Stream> streamList = new ArrayList<>();

    public List<Stream> getSortedStreamByCount() {
        List<Stream> list = new ArrayList<>(streamList);
        list.sort(new StreamComparator());
        return list;
    }




//           public void sortStreams(List<Stream> streams) {
//            Collections.sort(streams, new StreamComparator());
//            streams.sort(new StreamComparator());
}
