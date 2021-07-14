package day62_collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> friends = new LinkedList<>();
        List<Integer> scores = new LinkedList<>();
        scores.add(5);
        scores.add(42);
        scores.add(23);
        scores.add(42); // allows duplicates
        System.out.println(scores);

        friends.add("Mahkliva");
        friends.add("abbas");


    }
}
