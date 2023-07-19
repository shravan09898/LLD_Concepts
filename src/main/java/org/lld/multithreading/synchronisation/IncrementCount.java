package org.lld.multithreading.synchronisation;

public class IncrementCount implements Runnable{
    private  Count count;

    public IncrementCount(Count count) {
        this.count = count;
    }


    @Override
    public void run() {
        for(int i=1;i<=1000;i++){
            count.increment();
        }
    }
}
