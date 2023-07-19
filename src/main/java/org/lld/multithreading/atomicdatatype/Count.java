package org.lld.multithreading.atomicdatatype;

public class Count {
    int count;

    public Count(int count) {
        this.count = count;
    }
    public int increment(){
        count++;
        return count;
    }
}
