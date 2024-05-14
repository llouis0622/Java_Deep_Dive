package collection.deque.test.queue;

import java.util.LinkedList;
import java.util.Queue;

public class PrinterQueueTest {
    public static void main(String[] args) {
        Queue<String> printQueue = new LinkedList<>();

        printQueue.offer("doc1");
        printQueue.offer("doc2");
        printQueue.offer("doc3");

        System.out.println("출력 : " + printQueue.poll());
        System.out.println("출력 : " + printQueue.poll());
        System.out.println("출력 : " + printQueue.poll());
    }
}