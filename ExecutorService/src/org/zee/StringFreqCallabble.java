package org.zee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class StringFreqCallabble {
    public static void main(String[] args) {
        String countStr="sertyhvdrtyjbvfrtyujnbftyujhdsertyukmnvcdrtyuiknbvfrtyukjnvftyujkjnbvdftyukjnbvcxsdrtyjnbbvcxsdfgthjsertyhvdrtyjbvfrtyujnbftyujhdsertyukmnvcdrtyuiknbvfrtyukjnvftyujkjnbvdftyukjnbvcxsdrtyjnbbvcxsdfgthjsertyhvdrtyjbvfrtyujnbftyujhdsertyukmnvcdrtyuiknbvfrtyukjnvftyujkjnbvdftyukjnbvcxsdrtyjnbbvcxsdfgthjsertyhvdrtyjbvfrtyujnbftyujhdsertyukmnvcdrtyuiknbvfrtyukjnvftyujkjnbvdftyukjnbvcxsdrtyjnbbvcxsdfgthjsertyhvdrtyjbvfrtyujnbftyujhdsertyukmnvcdrtyuiknbvfrtyukjnvftyujkjnbvdftyukjnbvcxsdrtyjnbbvcxsdfgthjsertyhvdrtyjbvfrtyujnbftyujhdsertyukmnvcdrtyuiknbvfrtyukjnvftyujkjnbvdftyukjnbvcxsdrtyjnbbvcxsdfgthjsertyhvdrtyjbvfrtyujnbftyujhdsertyukmnvcdrtyuiknbvfrtyukjnvftyujkjnbvdftyukjnbvcxsdrtyjnbbvcxsdfgthjsertyhvdrtyjbvfrtyujnbftyujhdsertyukmnvcdrtyuiknbvfrtyukjnvftyujkjnbvdftyukjnbvcxsdrtyjnbbvcxsdfgthjsertyhvdrtyjbvfrtyujnbftyujhdsertyukmnvcdrtyuiknbvfrtyukjnvftyujkjnbvdftyukjnbvcxsdrtyjnbbvcxsdfgthj";
        ExecutorService executorService= Executors.newFixedThreadPool(5);
        int length=countStr.length();
        List<Future<Map<Character,Long>>> futureList=new ArrayList<>();
        int size=10;
        for (int i = 0; i <length;) {
            TaskCallale taskCount=new TaskCallale(countStr,i,i+size);
           Future<Map<Character,Long>> freqFuture= executorService.submit(taskCount);
           futureList.add(freqFuture);
            i+=size;
        }
        Map<Character,Long> result=new HashMap<>();
        for (Future<Map<Character,Long>> future:futureList){
            try {
                Map<Character,Long> freqmap=future.get();
                freqmap.forEach((key,value)->{
                    result.put(key,result.getOrDefault(key,0l)+value);
                });
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(result);
        System.out.println("done");
    }
}
