package com.bl.program.day16.day17;

import AlgorithmUtility.AlgorithmUtility;

public class InsertionSorting {
    public static void main(String args[]){
        AlgorithmUtility algorithmUtility = new AlgorithmUtility();
        String []arr = {"hello", "everyone", "how", "are", "you", "all"};
        int n = arr.length;

        algorithmUtility.insertionSort(arr,n);
        algorithmUtility.printArray(arr, n);

    }
}
