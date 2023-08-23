package com.practice.javaprograms;

import java.math.BigInteger;
import java.util.Scanner;

class AddTwoNumbers {
    private String s1, s2;
    private BigInteger sum;

    public void getNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers : ");
        s1 = sc.nextLine();
        s2 = sc.nextLine();
    }

    public void add() {
        BigInteger num1 = new BigInteger(s1);
        BigInteger num2 = new BigInteger(s2);
        sum = num1.add(num2);
    }

    public void show() {
        System.out.println("The sum of two numbers is : ");
        System.out.println(sum);
    }
}
public class AddTwoBigIntegers {
    public static void main(String[] args) {
        AddTwoNumbers add = new AddTwoNumbers();
        add.getNumbers();
        add.add();
        add.show();
        System.out.println("\n================Program Ended==============");
    }
}
