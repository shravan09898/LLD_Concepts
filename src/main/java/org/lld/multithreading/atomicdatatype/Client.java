package org.lld.multithreading.atomicdatatype;

import java.util.concurrent.atomic.AtomicInteger;

public class Client {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        Count count = new Count(0);
        AtomicCount atomicCount = new AtomicCount(atomicInteger);

        Incrementer incrementer = new Incrementer(count, atomicCount);

        Thread t1 = new Thread(incrementer);
        Thread t2 = new Thread(incrementer);

        t1.start();
        t2.start();
    }
}
