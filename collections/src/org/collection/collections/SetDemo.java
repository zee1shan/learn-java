package org.collection.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
//        Set<Integer> set=new HashSet<>();
//        Set<Integer> set=new LinkedHashSet<>(); //insertion order
        Set<Integer> set=new TreeSet<>(); //sorted order

        set.add(23);
        set.add(230);
        set.add(22);
        set.add(22);
        set.add(22);
        set.add(13);
        set.add(39);

        System.out.println(set);
        System.out.println(set.size());
    }
}
