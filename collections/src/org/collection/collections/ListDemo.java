package org.collection.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        // list is an interface we cant do new List()
//        we can use any implementtaion of list interface
//        List<Integer> intergList=new ArrayList<>();
        List<Integer> intergList=new LinkedList<>();
        intergList.add(10);
        intergList.add(20);
        intergList.add(30);
        intergList.add(40);
        System.out.println(intergList.get(3));
        System.out.println(intergList);
    }
}
