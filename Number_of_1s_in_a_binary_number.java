package com.practice.javaprograms;

import java.util.Scanner;

public class Number_of_1s_in_a_binary_number {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        number = sc.nextInt();
        int count = 0;
        while(number != 0){
            int bit = number & 1;
            if(bit == 1){
                count++;
            }
            number = number >> 1;
        }
        System.out.println("It's binary has " + count + " 1s");
    }
}
