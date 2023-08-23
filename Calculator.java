package com.practice.javaprograms;

import java.util.ArrayList;
import java.util.Scanner;

interface Calculate {
    int add();
    int sub();
    int mul();
    int div();
}
class Process implements Calculate {
    private final ArrayList<Integer> arr = new ArrayList<>();

    public char getArr() {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; ; i++) {
            System.out.println("Enter a number : ");
            arr.add(i, sc.nextInt());
            if(arr.get(i) == 0) {
                break;
            }
        }
        System.out.println("Enter the operation : ");
        return (sc.next().charAt(0));
    }

    @Override
    public int add() {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

    @Override
    public int sub() {
        int dif = arr.get(0) * 2;
        for (int element : arr) {
            dif -= element;
        }
        return (dif);
    }

    @Override
    public int mul() {
        int prod = 1;
        for (int element : arr) {
            prod *= element;
        }
        return prod;
    }

    @Override
    public int div() {
        int divv = arr.get(0) * 2;
        for (int element : arr) {
            divv /= element;
        }
        return divv;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Process p = new Process();
        System.out.println("Enter numbers...");
        char c = p.getArr();
        int ret = 0;
        switch (c) {
            case '+' -> ret = p.add();
            case '-' -> ret = p.sub();
            case '*' -> ret = p.mul();
            case '/' -> ret = p.div();
            default -> System.out.println("Wrong Input !!!");
        }
        System.out.println(ret);
    }
}
