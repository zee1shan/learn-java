package org.zee;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class StringFreqCount {
    public static void main(String[] args) {


        String countStr="sertyhvdrtyjbvfrtyujnbftyujhdsertyukmnvcdrtyuiknbvfrtyukjnvftyujkjnbvdftyukjnbvcxsdrtyjnbbvcxsdfgthjsertyhvdrtyjbvfrtyujnbftyujhdsertyukmnvcdrtyuiknbvfrtyukjnvftyujkjnbvdftyukjnbvcxsdrtyjnbbvcxsdfgthjsertyhvdrtyjbvfrtyujnbftyujhdsertyukmnvcdrtyuiknbvfrtyukjnvftyujkjnbvdftyukjnbvcxsdrtyjnbbvcxsdfgthjsertyhvdrtyjbvfrtyujnbftyujhdsertyukmnvcdrtyuiknbvfrtyukjnvftyujkjnbvdftyukjnbvcxsdrtyjnbbvcxsdfgthjsertyhvdrtyjbvfrtyujnbftyujhdsertyukmnvcdrtyuiknbvfrtyukjnvftyujkjnbvdftyukjnbvcxsdrtyjnbbvcxsdfgthjsertyhvdrtyjbvfrtyujnbftyujhdsertyukmnvcdrtyuiknbvfrtyukjnvftyujkjnbvdftyukjnbvcxsdrtyjnbbvcxsdfgthjsertyhvdrtyjbvfrtyujnbftyujhdsertyukmnvcdrtyuiknbvfrtyukjnvftyujkjnbvdftyukjnbvcxsdrtyjnbbvcxsdfgthjsertyhvdrtyjbvfrtyujnbftyujhdsertyukmnvcdrtyuiknbvfrtyukjnvftyujkjnbvdftyukjnbvcxsdrtyjnbbvcxsdfgthjsertyhvdrtyjbvfrtyujnbftyujhdsertyukmnvcdrtyuiknbvfrtyukjnvftyujkjnbvdftyukjnbvcxsdrtyjnbbvcxsdfgthj";
//    TaskCount taskCount=new TaskCount()
        ExecutorService executorService= Executors.newFixedThreadPool(5);
        int length=countStr.length();
        List<TaskCount> taskCountList=new ArrayList<>();
        int size=10;
        Long st=System.currentTimeMillis();
        for (int i = 0; i <length;) {
            TaskCount taskCount=new TaskCount(countStr,i,i+size);
            executorService.submit(taskCount);
            taskCountList.add(taskCount);
            i+=size;
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(4, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Map<Character, Long> resultMap=new HashMap<>();
        for (TaskCount taskCount : taskCountList) {
            System.out.println(taskCount.getFreqMap());
//           Set<Character> keys= taskCountList.get(i).getFreqMap().keySet();
//           taskCountList.get(i).getFreqMap().entrySet()
//            for (Character c:keys) {
//                resultMap.put()
//            }
            taskCount.getFreqMap().forEach((key, value) -> {
                resultMap.put(key, resultMap.getOrDefault(key, 0l) + value);
            });

        }

//        for (int i = 0; i <length ; i++) {
//            Character c=countStr.charAt(i);
//            resultMap.put(c,resultMap.getOrDefault(c,0l)+1);
//        }
        Long et=System.currentTimeMillis();
        System.out.println("end tiem "+(et-st));
        System.out.println(resultMap);
        System.out.println("done");
    }




}
