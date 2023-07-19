package org.lld.multithreading.synchronisation;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Count {
    private int val = 0;
    private final Lock lock = new ReentrantLock();

    public void increment(){
        lock.lock();
        val++;
        lock.unlock();
    }

    public int getVal() {
        return val;
    }
}
