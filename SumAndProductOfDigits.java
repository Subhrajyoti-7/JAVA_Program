package com.practice.javaprograms;

class SumAndProduct{
    int sum = 0, product = 1;
    void digit(int number){
        while(number != 0){
            int rem = number % 10;
            number = number / 10;

            sum = sum + rem;
            product = product * rem;
        }
    }
    void show(){
        System.out.println("Sum of the digits is     : " + sum);
        System.out.println("Product of the digits is : " + product);
    }
}

public class SumAndProductOfDigits {
    public static void main(String[] args) {
        int number = 234;
        SumAndProduct SM = new SumAndProduct();
        SM.digit(number);
        SM.show();
    }
}
