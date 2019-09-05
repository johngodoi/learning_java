package com.johngodoi.java.hackerrank;

import java.util.AbstractMap;
import java.util.Scanner;

public class Day20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        Integer[] a = new Integer[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        AbstractMap.SimpleEntry<Integer[],Integer> pair = bubblesort(a);
        System.out.println("Array is sorted in "+pair.getValue()+" swaps.");
        System.out.println("First Element: "+pair.getKey()[0]);
        System.out.println("Last Element: "+pair.getKey()[n-1]);
    }

    public static AbstractMap.SimpleEntry<Integer[],Integer> bubblesort(Integer[] a){
        int numberOfSwaps = 0;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            // Track number of elements swapped during a single array traversal

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        return new AbstractMap.SimpleEntry<>(a,numberOfSwaps);
    }
}


