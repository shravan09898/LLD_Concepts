package org.lld.multithreading.join;

public class HelloworldPrinterWithWait implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Printing this line from Thread2 : "+Thread.currentThread().getName());
    }
}
