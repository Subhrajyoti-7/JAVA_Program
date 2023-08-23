package com.practice.javaprograms;


public class SameAndReverseNumber {

    static int sameNum(int n){
        int rem = n % 10;
        int dig = n / 10;

        if(dig == 0){
            return (rem);
        }else {
            return ((sameNum(dig) * 10 + rem));
        }
    }

    static int revNum(int n){
        int rem;
        int num = 0;
        while(n != 0){
            rem = n % 10;
            n = n / 10;
            num = num * 10 + rem;
        }
        return num;
    }

    public static void main(String[] args) {
        int n = 2005;
        int num = sameNum(n);
        System.out.println(num);
        int rev = revNum(n);
        System.out.println(rev);
    }
}