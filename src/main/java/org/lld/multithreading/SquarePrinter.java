package org.lld.multithreading;

public class SquarePrinter implements Runnable{
    public int n;

    public SquarePrinter(int n) {
        this.n = n;
    }

    public void run(){
        System.out.println("Thread name : "+ Thread.currentThread().getName());
        System.out.println("Square of a numer : "+ (n*n));
    }
}
