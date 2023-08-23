package com.practice.javaprograms;

import java.util.Scanner;

class Search{
    int size, check;

    int findNUmber(int[] arr, int start, int end){
        int mid = (start + end) / 2;
        if(start <= end) {
            if (arr[mid] == check) {
                return mid;
            } else if (arr[mid] > check) {
                return (findNUmber(arr, start, mid - 1));
            } else {
                return (findNUmber(arr, mid + 1, end));
            }
        }else{
            return -1;
        }
    }
    int searchNumber(int[] arr, int check){
        size = arr.length;
        this.check = check;
        return findNUmber(arr, 0, size-1);
    }
}

public class BinarySearchInAnAscendingArray {
    public static void main(String[] args) {
        System.out.print("Enter how many numbers you want to enter : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter a number : ");
            arr[i] = sc.nextInt();
        }
        Search search = new Search();
        System.out.print("Which number do you want to search : ");
        int check = sc.nextInt();
        int num = search.searchNumber(arr, check);
        if(num == (-1)){
            System.out.println("Your given number is not present in the list");
        }else {
            System.out.println(check + " is present at index " + num);
        }
        while(true){
            System.out.print("If you want to search any other number press Y / y otherwise press any key to exit : ");
            char ch = sc.next().charAt(0);
            if(ch == 'Y' || ch == 'y'){
                System.out.print("Which number do you want to search : ");
                check = sc.nextInt();
                num = search.searchNumber(arr, check);
                if(num == (-1)){
                    System.out.println("Your given number is not present in the list");
                }else {
                    System.out.println(check + " is present at index " + num);
                }
            }else{
                break;
            }
        }
    }
}
