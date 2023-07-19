package org.lld.multithreading.executors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {

    List<Integer> arraytoSort;
    ExecutorService executorService;

    public MergeSorter(List<Integer> arraytoSort, ExecutorService executorService) {
        this.arraytoSort = arraytoSort;
        this.executorService = executorService;
    }



    @Override
    public List<Integer> call() throws Exception {
        if(arraytoSort.size()<=1){
            return arraytoSort;
        }

        int mid = arraytoSort.size()/2;

        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        for(int i=0;i<mid;i++){
            leftArray.add(arraytoSort.get(i));
        }

        for(int i=mid;i<arraytoSort.size();i++){
            rightArray.add(arraytoSort.get(i));
        }

        MergeSorter leftMerge = new MergeSorter(leftArray, executorService);
        MergeSorter rightMerge = new MergeSorter(rightArray, executorService);

        Future<List<Integer>> fLeftSortedArray = executorService.submit(leftMerge);
        Future<List<Integer>> fRightSortedArray = executorService.submit(rightMerge);

        List<Integer> sortedArray = new ArrayList<>();
        List<Integer> leftSortedArray = fLeftSortedArray.get();
        List<Integer> rightSortedArray = fRightSortedArray.get();

        int i=0,j=0;

        while(i<leftSortedArray.size() && j<rightSortedArray.size()){
            if(leftSortedArray.get(i)<rightSortedArray.get(j)){
                sortedArray.add(leftSortedArray.get(i));
                i++;
            }
            else{
                sortedArray.add(rightSortedArray.get(j));
                j++;
            }
        }

        while(i<leftSortedArray.size() ){
            sortedArray.add(leftSortedArray.get(i));
            i++;
        }
        while(j<rightSortedArray.size() ){
            sortedArray.add(rightSortedArray.get(j));
            j++;
        }
        return sortedArray;
    }
}
