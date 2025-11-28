package org.collection.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, List<Integer>> cityPinCodes=new HashMap<>();
        String city="New Delhi";
        List<Integer> pinCodes=new ArrayList<>();
        pinCodes.add(1100024);
        pinCodes.add(1100024);

        cityPinCodes.put(city,pinCodes);
        cityPinCodes.get(city);

        System.out.println(cityPinCodes.get(city));

        Map<String,Student> studentMap=new HashMap<>();
        Student s1=new Student("zee",1);
        Student s2=new Student("zai",2);
        Student s3=new Student("zee",1);
        Student s4=new Student("zaa",2);

        studentMap.put("zee",s1);
        studentMap.put("zai",s2);
        studentMap.put(null,s3);
        studentMap.put("zee",null);

        System.out.println("size "+ studentMap.size());
        System.out.println(studentMap.get(null));
        // no null pointer here if i try to acees any string method then i will get null exception
        System.out.println(studentMap.get("null"));

        Map<Student,Integer>studentIntegerMap=new HashMap<>();

        studentIntegerMap.put(s1,4);
        studentIntegerMap.put(s3,40);
       // same s1 and s3 so size will be only one
        System.out.println("studentIntMapSize  "+studentIntegerMap.size());
        System.out.println(studentIntegerMap.get(s1));
        System.out.println(studentIntegerMap.get(s3));

        // first occurance of number


//        int []arr= {1, 5, 3, 4, 3, 5, 6};
//       Map<Integer,Integer> integerMap=new HashMap<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            if(integerMap.containsKey(arr[i])){
//                return integerMap.get(i)+1;
//            }
//            integerMap.put(arr[i],i);
//
//        }
//        return -1
    }
}
