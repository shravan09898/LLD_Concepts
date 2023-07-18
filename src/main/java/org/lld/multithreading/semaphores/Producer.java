package org.lld.semaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Queue<Shirt> store;
    private String name;

    private Semaphore semaphoreForProducer;
    private Semaphore semaphoreForConsumer;

    public Producer(Queue<Shirt> store, String name, Semaphore semaphoreForProducer, Semaphore semaphoreForConsumer) {
        this.store = store;
        this.name = name;
        this.semaphoreForProducer = semaphoreForProducer;
        this.semaphoreForConsumer = semaphoreForConsumer;
    }


    @Override
    public void run() {
        while (true){
            try {
                semaphoreForProducer.acquire();
                store.add(new Shirt());
                System.out.println(name+" : produced, total shirts available : "+store.size());
                semaphoreForConsumer.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
