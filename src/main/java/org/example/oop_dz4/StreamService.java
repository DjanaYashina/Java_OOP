package org.example.oop_dz4;

import java.util.ArrayList;
import java.util.List;

public class StreamService {
    private List<Stream> streamList;

    public List<Stream> getSortedStreamByCount() {
        List<Stream> list = new ArrayList<>(streamList);
        list.sort(new StreamComparator());
        return list;
    }




//           public void sortStreams(List<Stream> streams) {
//            Collections.sort(streams, new StreamComparator());
//            streams.sort(new StreamComparator());
}
