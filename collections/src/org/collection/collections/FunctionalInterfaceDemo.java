package org.collection.collections;

import java.util.function.Predicate;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Calculator addition= (a, b) -> a+b;
        System.out.println(addition.calculate(4,5));
        System.out.println(addition.kare());
        Calculator multiply=(a,b)->a*b;
        System.out.println(multiply.calculate(3,4));

        Check checkEven=(num) -> { return num%2==0;};
        System.out.println(checkEven.check(3));

        Predicate<Integer> checkOdd=(num)->num%2==1;
        System.out.println(checkOdd.test(56));

        Predicate <Integer> oddGeatrthenSeven=checkOdd.and((num)->num>7);

        System.out.println(oddGeatrthenSeven.test(5));
    }
}
interface Check {
    boolean check (Integer num);
}