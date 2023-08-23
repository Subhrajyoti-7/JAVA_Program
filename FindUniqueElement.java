package com.practice.javaprograms;

import java.util.Scanner;

public class FindUniqueElement {
    public static void main(String[] args){
        int no_of_element;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to enter : ");
        no_of_element = sc.nextInt();
        int[] numbers = new int[no_of_element];
        for(int i = 0; i < no_of_element; i++){
            System.out.print("Enter a number : ");
            numbers[i] = sc.nextInt();
        }
        int unique = 0;
        for (int element : numbers) {
            unique = unique ^ element;
        }
        System.out.println(unique);
    }
}
