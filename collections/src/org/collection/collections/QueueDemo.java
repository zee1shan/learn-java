package org.collection.collections;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // fifo order
//        Queue<Integer> integerQueue=new LinkedList<>();
//        Queue<Integer> integerQueue=new PriorityQueue<>();  //min heap
//        Queue<Integer> integerQueue=new PriorityQueue<>(Comparator.reverseOrder());  //max heap
        Queue<Integer> integerQueue=new PriorityQueue<>();  //max heap

        integerQueue.add(100);
        integerQueue.add(10000);
        integerQueue.add(90);
        System.out.println(integerQueue.peek());
//        System.out.println(integerQueue.poll());
//        System.out.println(integerQueue.poll());
//        System.out.println(integerQueue.poll());
    }
}
