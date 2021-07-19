package com.bl.program.day16.day17;

import AlgorithmUtility.AlgorithmUtility;

import java.util.Scanner;

public class BinarySearchWord {
    public static void main(String[] args) {
        AlgorithmUtility algorithmUtility = new AlgorithmUtility();
        Scanner sc = new Scanner(System.in);

        String []arr = {"hello", "everyone","hi", "I", "Know", "you",};
        int n = arr.length;

        algorithmUtility.insertionSort(arr,n);
        System.out.print("Enter the word: ");
        String word = sc.next();
        boolean result = algorithmUtility.binarySearchWord(arr,word);
        System.out.println(result);
    }
}
