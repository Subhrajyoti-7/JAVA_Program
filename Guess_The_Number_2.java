package com.practice.javaprograms;
import java.util.Scanner;
import java.util.Random;

class GuessTheNumber {
    int number;
    int inputNumber;
    int noOfGuess = 0;

    public GuessTheNumber() {
        Random rand = new Random();
        number = rand.nextInt(100);
    }

    public void userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess the number : ");
        inputNumber = sc.nextInt();
        noOfGuess++;
    }

    public boolean check() {
        if (inputNumber == number) {
            System.out.println("\n\t\t<<<<<-   You win   ->>>>>\nYou have guessed the number in " + noOfGuess + " " +
                    "chances");
            System.out.println("Your Score  \t: " + ((21 - noOfGuess) * 50));
            return false;
        } else if (inputNumber < number) {
            System.out.println("your number is less than the actual number\n");
            return true;
        } else {
            System.out.println("Your number is greater than the actual number\n");
            return true;
        }
    }
}

public class Guess_The_Number_2 {
    public static void main(String[] args) {
        System.out.println("This is a Guess the number game\nWhere computer generates a number between 0 to 100 and " +
                "you have 10 choices to guess that number.");
        System.out.println("Score will be given out of 10");
        System.out.println("Computer fixed a number.\n");
        GuessTheNumber game = new GuessTheNumber();

        boolean b = true;
        int i = 20;
        while (b) {
            if(i == 0) {
                System.out.println("You loss!!!.\nBetter luck next time...");
                System.exit(0);
            }
            System.out.println("You have " + i-- + " chances left");
            game.userInput();
            b = game.check();
        }
    }
}
