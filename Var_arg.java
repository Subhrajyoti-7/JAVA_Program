package com.practice.javaprograms;

public class Var_arg {
    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        int[] b = {40, 50, 60};
        gulu(a, b);
    }

    public static void gulu(int[]... x){
        for(int[] x1: x){
            for(int x2: x1){
                System.out.println(x2);
            }
        }
    }
}