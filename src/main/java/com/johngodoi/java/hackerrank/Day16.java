package com.johngodoi.java.hackerrank;

import java.util.Scanner;

/**
 * Read a string, , and print its integer value; if  cannot be converted to an integer, print Bad String.
 */
public class Day16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
            System.out.println(Integer.parseInt(S));
        } catch (Exception e){
            System.out.println("Bad String");
        }
    }
}
