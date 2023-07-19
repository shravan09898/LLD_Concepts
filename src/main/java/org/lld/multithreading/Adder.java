package org.lld.multithreading;

public class Adder implements Runnable{

    public int a;
    public int b;

    public Adder(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void run(){
        System.out.println("Thread of Adder : "+ Thread.currentThread().getName());
        System.out.println("Sum result : "+ (a+b));
    }
}
