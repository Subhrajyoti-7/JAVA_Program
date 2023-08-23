package com.practice.javaprograms;

public class ArrayReferencePassing {
    public static void main(String[] args) {
        int[] a = {10, 20};
        int[] b;
        //int[] b = a;  (Also allowed)
        b = a;
        System.out.println(b[0]);
    }
}
