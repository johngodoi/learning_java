package com.johngodoi.java.hackerrank;

import java.util.*;

public class Day18 {

    Stack<Character> stack = new Stack<>();
    Queue<Character> queue = new ArrayDeque<>();

    private Character dequeueCharacter() {
        return this.queue.remove();
    }

    private Character popCharacter() {
        return this.stack.pop();
    }

    private void enqueueCharacter(char c) {
        this.queue.add(c);
    }

    private void pushCharacter(char c) {
        this.stack.push(c);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18 p = new Day18();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}