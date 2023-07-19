package org.lld.multithreading.executors;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        ExecutorService executorService = Executors.newScheduledThreadPool(10);
//
//        for(int i=1;i<=50;i++){
//            if(i==5 || i==11 || i==25){
//                System.out.println("Debug");
//            }
//            CubePrinter cubePrinter = new CubePrinter(i);
//            executorService.execute(cubePrinter);
//        }
//
//        executorService.shutdown();
        //MergeSort
        List<Integer> list = new ArrayList<>(
                Arrays.asList(1,5,6,3,2,0,9,10));
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        MergeSorter mergeSorter = new MergeSorter(list, executorService);
        Future<List<Integer>> fSortedList = executorService.submit(mergeSorter);

        List<Integer> sortedList = fSortedList.get();

        System.out.println("Sorted List : "+sortedList);
        executorService.shutdown();
    }
}
