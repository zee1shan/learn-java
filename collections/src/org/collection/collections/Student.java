package org.collection.collections;

import java.util.Objects;

public class Student implements Comparable{
    private String name;
    private Integer rollNo;

    public Student(String name,Integer rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(rollNo, student.rollNo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Student student)) return false;
//        return Objects.equals(rollNo, student.rollNo);
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hashCode(rollNo);
//    }

    @Override
    public String toString() {
        return "Student {" +
                "Name='"+name +
                "\n"+
                "rollNo='"+rollNo+
                "}";

    }

    @Override
    public int compareTo(Object o) {
        return rollNo.compareTo(((Student) o).getRollNo());
    }
}
