package org.lld.multithreading.callable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list1 = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(
                Arrays.asList(6, 7, 8, 9, 10));

        /*
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);
         */

        ArrayAdder adder1 = new ArrayAdder((ArrayList<Integer>) list1);  //Thread does not accept callable
        ArrayAdder adder2 = new ArrayAdder((ArrayList<Integer>) list2);  //so we use executors for callables

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<Integer> sum1 = executorService.submit(adder1);
        Future<Integer> sum2 = executorService.submit(adder2);

        int s1 = sum1.get();
        int s2 = sum2.get();

        System.out.println("Final Result : "+(s1+s2));

        executorService.shutdown();
    }
}
