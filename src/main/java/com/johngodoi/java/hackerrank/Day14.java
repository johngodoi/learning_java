package com.johngodoi.java.hackerrank;

import java.util.Scanner;


class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int ...elements){
        this.elements = elements;
    }

    void computeDifference(){
        this.maximumDifference = 0;
        for(int i=0;i<this.elements.length;i++){
            for(int j=0;j<this.elements.length; j++){
                int diff = Math.abs(this.elements[i]-this.elements[j]);
                if(diff > this.maximumDifference){
                    this.maximumDifference = diff;
                }
            }
        }
    }

}

public class Day14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}