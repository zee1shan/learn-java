package org.collection.collections;

import java.util.HashSet;
import java.util.Set;

public class EqualsHashCodeDemo {

    public static void main(String[] args) {
        Student student1=new Student("zeeshan",1);
        Student student2=new Student("zeeshan",1);

        Set<Student> studentSet=new HashSet<>();

        System.out.println(student1==student2);
        System.out.println(student1.equals(student2));

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(new Student("zaid",2));
        System.out.println("Student size "+ studentSet.size());
    }
}
