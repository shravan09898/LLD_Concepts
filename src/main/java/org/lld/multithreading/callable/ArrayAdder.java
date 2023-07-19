package org.lld.multithreading.callable;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class ArrayAdder implements Callable<Integer> {

    ArrayList<Integer> elements;

    public ArrayAdder(ArrayList<Integer> elements) {
         this.elements = elements;
    }

    @Override
    public Integer call() {
         int sum = 0;
         for(int i: elements){
             sum+=i;
         }
         return sum;
    }
}
