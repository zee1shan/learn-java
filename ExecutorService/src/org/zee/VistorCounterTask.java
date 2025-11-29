package org.zee;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class VistorCounterTask implements Runnable{
    private  int count=0;
//    private AtomicInteger count=new AtomicInteger();
    private Lock lock=new ReentrantLock();

//    public int getCount() {
//        return count.get();
//    }
    public int getCount() {
        return count;
    }

//    public void setCount(int count) {
//        this.count = count;
//    }
//    public synchronized void increment(){
//        count++;
//    }

//    public synchronized void increment(){
//        count.incrementAndGet();
//    }
    public synchronized void increment(){
        lock.lock();
        count++;
        lock.unlock();
    }


    @Override
    public void run() {
        increment();
    }
}
