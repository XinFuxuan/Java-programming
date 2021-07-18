package day63_Collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("one");
        queue.add("two");
        System.out.println(queue.element()); // similar
        System.out.println(queue.peek());
        System.out.println(queue.remove()); // First in first out rule apply, throw exception if not right
        System.out.println(queue.poll()); // first in first out rule apply, don't throw exception
        System.out.println(queue);
    }


}
