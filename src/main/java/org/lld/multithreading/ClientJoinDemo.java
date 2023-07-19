package org.lld.multithreading;

public class ClientJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        HelloworldPrinter helloworldPrinter = new HelloworldPrinter();
        Thread thread = new Thread(helloworldPrinter);
        thread.start();

        thread.join();
        System.out.println("Printing this line from main : "+thread.getName());
    }
}
