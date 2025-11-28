package org.collection.collections;


@FunctionalInterface
public interface Calculator {
    int calculate(int a ,int b);
     default  boolean kare(){
         return true;
     }
}
