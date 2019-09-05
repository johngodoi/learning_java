package com.johngodoi.java.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface AdvancedArithmetic{
    int divisorSum(int n);
}

class Calculator19 implements AdvancedArithmetic {
    public int divisorSum(int n) {
        List<Integer> divisors = new ArrayList<Integer>();
        for(int i=1; i<=n; i++){
            if(n%i==0) divisors.add(i);
        }
        return divisors.stream().reduce((x,y) -> x+y).get();
    }
}

class Day19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator19();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
