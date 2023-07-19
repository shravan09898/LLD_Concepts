package org.lld.multithreading;

public class HelloworldPrinter implements Runnable{
    @Override
    public void run(){
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("Current Thread : "+Thread.currentThread().getName());
        System.out.println("Printing HelloWorld from new Thread");
    }
}
