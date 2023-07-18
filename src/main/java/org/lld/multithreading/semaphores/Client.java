package org.lld.semaphores;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Queue<Shirt> store = new ArrayDeque<>();

        Semaphore semaphoreProducer = new Semaphore(5);   // 5 is maxSizeofStore
        Semaphore semaphoreConsumer = new Semaphore(0);
        Producer p1 = new Producer(store, "P1", semaphoreProducer, semaphoreConsumer);
        Producer p2 = new Producer(store, "P2", semaphoreProducer, semaphoreConsumer);
        Producer p3 = new Producer(store, "P3", semaphoreProducer, semaphoreConsumer);
        Producer p4 = new Producer(store, "P4", semaphoreProducer, semaphoreConsumer);
        Producer p5 = new Producer(store, "P5", semaphoreProducer, semaphoreConsumer);

        Consumer c1 = new Consumer(store, "C1", semaphoreProducer, semaphoreConsumer);
        Consumer c2 = new Consumer(store, "C2", semaphoreProducer, semaphoreConsumer);
        Consumer c3 = new Consumer(store, "C3", semaphoreProducer, semaphoreConsumer);
        Consumer c4 = new Consumer(store, "C4", semaphoreProducer, semaphoreConsumer);
        Consumer c5 = new Consumer(store, "C5", semaphoreProducer, semaphoreConsumer);
        Consumer c6 = new Consumer(store, "C6", semaphoreProducer, semaphoreConsumer);
        Consumer c7 = new Consumer(store, "C7", semaphoreProducer, semaphoreConsumer);

        new Thread(p1).start();
        new Thread(p2).start();
        new Thread(p3).start();
        new Thread(p4).start();
        new Thread(p5).start();

        new Thread(c1).start();
        new Thread(c2).start();
        new Thread(c3).start();
        new Thread(c4).start();
        new Thread(c5).start();
        new Thread(c6).start();
        new Thread(c7).start();
    }
}
