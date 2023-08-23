package com.practice.javaprograms;

import java.util.Scanner;

class CreatePlates{
    String numberPlate;
    String code;
    StringBuilder letter = new StringBuilder();
    int numberOfPlates, digits;

    CreatePlates(String numberPlate, int numberOfPlates){
        this.numberPlate = numberPlate;
        this.numberOfPlates = numberOfPlates;
    }

    void getNum(){
        code = numberPlate.replaceAll("\\D", " ");
        code = code.trim();
        digits = Integer.parseInt(code);
        code = numberPlate.replaceAll("\\d", " ");
        code = code.trim();
    }

    void generate(){
        letter.append(code);
        for(int i = 1; i < numberOfPlates; i++){
            digits++;
            if(digits > 99999){
                digits = 1;
                char c = letter.charAt(3);
                letter.setCharAt(3, ++c);
            }
            numberPlate = String.format("%05d", digits);
            System.out.println(letter + " " + numberPlate);
        }
    }
}

public class NumberPlateGenerator {
    public static void main(String[] args) {
        String input;
        int numberOfPlates;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number plate (format : XX X 00000) : ");
        input = sc.nextLine();
        System.out.print("Enter how many number plate you want to generate : ");
        numberOfPlates = sc.nextInt();
        CreatePlates CP = new CreatePlates(input, numberOfPlates);
        CP.getNum();
        CP.generate();

//        WE CAN DO LIKE THIS
//
//        String s = "OD D 99998";
//        int n = 5;
//        StringBuilder sb = new StringBuilder();
//        String a, b;
//        a = s.substring(0, 4);
//        sb.append(a);
//        b = s.substring(5);
//        int lastDigits = Integer.parseInt(b);
//        lastDigits++;
//        for(int i = 1; i <= n; i++){
//            if(lastDigits > 99999) {
//                lastDigits = 1;
//                char c = sb.charAt(3);
//                sb.setCharAt(3, ++c);
//            }
//            b = String.valueOf(String.format("%05d", lastDigits++));
//            System.out.println(sb + " " + b);
//        }
    }
}
