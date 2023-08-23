package com.practice.javaprograms;

import java.util.Scanner;

class Sort{
    int partition(int[] arr, int start, int end){
        int mid = (start + end) / 2;
        int pivot = start;
        while(start <= end){
            do{
                
            }while (true);
        }

        return mid;
    }
    void quickSort(int[] arr, int start, int end){
        if(start <= end){
            int mid = partition(arr, start, end);
            quickSort(arr, start, mid - 1);
            quickSort(arr, mid + 1, end);
        }
    }
}

public class QuickSort {
    public static void main(String[] args) {
        System.out.print("How many numbers you want to enter : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the values to the number list : ");
        for(int i = 0; i < size; i++){
            System.out.print("Enter a number : ");
            arr[i] = sc.nextInt();
        }

        Sort QS = new Sort();
        QS.quickSort(arr, 0, size - 1);
    }
}
