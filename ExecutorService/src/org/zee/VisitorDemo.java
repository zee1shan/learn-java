package org.zee;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class VisitorDemo {

    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(4);
        VistorCounterTask vistorCounterTask=new VistorCounterTask();

        for (int i = 0; i<1000 ; i++) {
            executorService.submit(vistorCounterTask);
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(4, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Total visistor"+ vistorCounterTask.getCount());
    }}
