package org.collection.collections;

import java.util.*;

public class UtilsDemo {
    public static void main(String[] args) {
        Integer [] arr={10,2,44,3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        List<Integer> integerList=new ArrayList<>();
        integerList.add(10);
        integerList.add(10);
        integerList.add(10);

        int c=Collections.max(integerList);
        System.out.println(integerList);
        System.out.println(c);

        List<String> stringList=Arrays.asList("zee","zaa","zoo");
        System.out.println(stringList);
        Collections.sort(stringList);
        System.out.println(stringList);

        Student s1=new Student("zee",12);
        Student s2=new Student("zaa",3);
        Student s3=new Student("zoo",4);
        List<Student> studentList=Arrays.asList(s1,s2,s3);

        Collections.sort(studentList);
//        Collections.sort(studentList, Comparator.reverseOrder());

        System.out.println("based on roll"+studentList);

        // comparator function
        Collections.sort(studentList, (o1, o2) -> o1.getName().compareTo(o2.getName()));
//        based on name
        System.out.println(studentList);
    }

}
