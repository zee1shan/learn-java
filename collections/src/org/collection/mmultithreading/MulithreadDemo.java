package org.collection.mmultithreading;

public class MulithreadDemo {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("hello1"+Thread.currentThread().getName());
        System.out.println("hello2"+Thread.currentThread().getName());
        System.out.println("hello3"+Thread.currentThread().getName());
        System.out.println("hello4"+Thread.currentThread().getName());
        System.out.println("hello5"+Thread.currentThread().getName());

        Thread thread1=new Thread(()->{
            System.out.println("hello44 "+Thread.currentThread().getName());
        });
        thread1.setName("My-Thread1");
       thread1.start();;
       thread1.join();
        System.out.println("hello6"+Thread.currentThread().getName());
        System.out.println("hello7"+Thread.currentThread().getName());
    }
}
