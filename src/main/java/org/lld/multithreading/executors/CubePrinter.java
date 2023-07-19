package org.lld.multithreading.executors;

public class CubePrinter implements Runnable{
    int x;

    public CubePrinter(int x) {
        this.x = x;
    }

    @Override
    public void run() {
        System.out.println("Thread Name : "+ Thread.currentThread().getName() +
                        " -> cube of the number " + x + " is equal to "+ (x*x*x));
    }
}
