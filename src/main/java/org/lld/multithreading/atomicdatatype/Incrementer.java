package org.lld.multithreading.atomicdatatype;

public class Incrementer implements Runnable{
    private Count count;
    private AtomicCount atomicCount;

    public Incrementer(Count count, AtomicCount atomicCount) {
        this.count = count;
        this.atomicCount = atomicCount;
    }

    @Override
    public void run() {
        for(int i=1;i<=1000;i++){
            System.out.println("Count : "+count.increment());
            System.out.println("Atomic Count : "+atomicCount.atomicInteger.getAndIncrement());
        }
    }
}
