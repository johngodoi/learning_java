package com.johngodoi.java.hackerrank;

import java.util.*;


/**
 * A level-order traversal, also known as a breadth-first search, visits each level of a tree's nodes from left to right,
 * top to bottom. You are given a pointer, root, pointing to the root of a binary search tree. Complete the levelOrder
 * function provided in your editor so that it prints the level-order traversal of the binary search tree.
 */
class Node23{
    Node23 left,right;
    int data;
    Node23(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

    static void levelOrderMap(Node23 root, Map<Integer,List<Integer>> dataByLevel, int level){
        if(root == null) return;
        List<Integer> values = dataByLevel.get(level);
        if(values == null) values = new ArrayList<>();
        values.add(root.data);
        dataByLevel.put(level, values);
        levelOrderMap(root.left, dataByLevel, level+1);
        levelOrderMap(root.right, dataByLevel, level+1);
    }

    static void levelOrder(Node23 root){
        HashMap<Integer, List<Integer>> dataByLevel = new HashMap<>();
        levelOrderMap(root, dataByLevel, 0);
        for(int i=0;i<dataByLevel.keySet().size();i++){
            List<Integer> values = dataByLevel.get(i);
            values.stream().forEach(v -> System.out.print(v+" "));
        }
    }

    public static Node23 insert(Node23 root,int data){
        if(root==null){
            return new Node23(data);
        }
        else{
            Node23 cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node23 root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}
