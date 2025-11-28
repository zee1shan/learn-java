package org.collection.collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(1,2,3,4,5,6,7);
        List<String> stringList=Arrays.asList("qbc","lll","qweryjjfj");

        Consumer<String> printStrLen=(str)->{
            System.out.println(str+":"+str.length());
        };
        Function<String,String> capitaLize=(str)->str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
        Function<String,String> addGreet=(str)->"hello Mr"+str;
        String ans=capitaLize.andThen(addGreet).apply("zee");
        System.out.println(ans);
        String multi=capitaLize.andThen(addGreet).andThen(capitaLize).andThen(addGreet).apply("multi");
        System.out.println(multi);
        String cap=capitaLize.apply("zee hai mera name");
        System.out.println("cap: "+ cap);

        Stream<Integer> sqList= integerList.stream().map((into)->into*into);
        Stream<Integer> sqEven=sqList.filter((num)->num%2==0);
        System.out.println(sqEven.toList());
//        stringList.forEach(printStrLen);
    }
}
