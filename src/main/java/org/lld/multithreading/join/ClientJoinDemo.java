package org.lld.multithreading.join;

import org.lld.multithreading.HelloworldPrinter;

public class ClientJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        HelloworldPrinter helloworldPrinter = new HelloworldPrinter();
        Thread thread = new Thread(helloworldPrinter);
        thread.start();
        HelloworldPrinterWithWait helloworldPrinterWithWait = new HelloworldPrinterWithWait();
        Thread thread1 = new Thread(helloworldPrinterWithWait);
        thread1.start();

        thread.join();
        System.out.println("Printing this line from main : "+thread.getName());
    }
}
