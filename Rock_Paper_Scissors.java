package com.practice.javaprograms;
import java.util.Scanner;
public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        System.out.println("This is a Rock_Paper_Scissors game. Where,");
        System.out.println("'R' indicates Rock\n'P' indicates Paper\n'S' indicates Scissors");
        System.out.println("This game has 5 rounds,\nWin point \t: 2\nLoss point \t: 0\nDrawn \t\t: 1");
        Scanner sc = new Scanner(System.in);
        int a = 0, b;
        int win = 0, loss = 0;
        while(a < 5) {
            b = 5 - a;
            System.out.println("\nYou have " + b + "chances left!");
            System.out.print("Please enter your input (R/P/S) : ");
            String choice = sc.next();
            int user = 0;
            if (choice.equalsIgnoreCase("R")) {
                user = 1;
            } else if (choice.equalsIgnoreCase("P")) {
                user = 2;
            } else if (choice.equalsIgnoreCase("S")) {
                user = 3;
            } else {
                System.out.println("You have entered a wrong choice");
            }

            int max = 3, min = 1;
            int comp = (int) (Math.random() * (max - min + 1) + min);
            if (comp == 1 && user == 1 || comp == 2 && user == 2 || comp == 3 && user == 3) {
                System.out.println("Opponent has chosen the same");
                System.out.println("Match drawn");
                win++;
                loss++;
            } else if (comp == 1 && user == 2) {
                System.out.println("Opponent\t-> Rock\nYou\t-> Paper");
                System.out.println("You Won this round");
                win = win+2;
            } else if (comp == 1 && user == 3) {
                System.out.println("Opponent -> Rock\nYou\t-> Scissors");
                System.out.println("You Loss this round");
                loss = loss+2;
            } else if (comp == 2 && user == 1) {
                System.out.println("Opponent -> Paper\nYou\t-> Rock");
                System.out.println("You Loss this round");
                loss = loss+2;
            } else if (comp == 2 && user == 3) {
                System.out.println("Opponent -> Paper\nYou\t-> Scissors");
                System.out.println("You Won this round");
                win = win+2;
            } else if (comp == 3 && user == 1) {
                System.out.println("Opponent -> Scissors\nYou\t-> Rock");
                System.out.println("You Won this round");
                win = win+2;
            } else if (comp == 3 && user == 2) {
                System.out.println("Opponent -> Scissors\nYou\t-> Paper");
                System.out.println("You Loss this round");
                loss = loss+2;
            }
            a++;
        }
        System.out.println("\n\nYour point is \t\t: " + win);
        System.out.println("Opponent's point is : " + loss);
        if(win < loss) {
            System.out.println("\n\tYou Loss");
        }else if(win > loss) {
            System.out.println("\n\tYou Won");
        }else {
            System.out.println("\n\tMatch Drawn");
        }
    }
}
