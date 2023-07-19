package org.lld.multithreading.atomicdatatype;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCount {
    AtomicInteger atomicInteger;

    public AtomicCount(AtomicInteger atomicInteger) {
        this.atomicInteger = atomicInteger;
    }
}
