package com.practice.javaprograms;

import java.util.Random;
import java.util.Scanner;

class Game {
    int comp;

    public int Guess() {
        Random random = new Random();
        comp = random.nextInt(100);
        return comp;
    }
}

public class Guess_The_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game myGame = new Game();
        System.out.println("This is a Guess the number game\nWhere computer generates a number between 0 to 100 and " +
                "you have 10 choices to guess that number.");
        System.out.println("Score will be given out of 10");
        while (true) {
            int comp = myGame.Guess();
            System.out.println("Computer fixed a number.\n");
            int i;
            for (i = 10; i > 0; i--) {
                System.out.println("You have " + i + " chances left");
                System.out.print("Guess the number : ");
                int user = sc.nextInt();
                if (user < comp) {
                    System.out.println("\nYour number is smaller than fixed number.\n");
                } else if (user > comp) {
                    System.out.println("\nYour number is greater than fixed number.\n");
                } else {
                    System.out.println("\nYou win");
                    System.out.println("Your Score is " + i);
                    if (i == 10) {
                        System.out.println("\n\tYaahooo...!!!\n\tOutstanding...!!!\n\tYou have Smashed");
                    } else if (i <= 4) {
                        System.out.println("\nDon't worry\nMake Your Imagination better");
                    } else if (i <= 7) {
                        System.out.println("\n\tGood.!\n\tKeep Going\n\tYou can Score better.");
                    } else if (i < 10) {
                        System.out.println("\n\tWow.. Excellent...!!\n\tWell played!!\n\tKeep Going");
                    }
                    break;
                }
            }
            if (i == 0) {
                System.out.println("\n\tYou Loss");
                System.out.println("""

                        \tBetter Luck Next Time
                        \tDon't be sad!~,
                        \tFocus on your game and make better choice.""");
            }
            System.out.print("\nDo you want to play again (Y / N) : ");
            char c;
            while (true) {
                c = sc.next().charAt(0);
                if (c == 'Y' || c == 'y') {
                    break;
                } else if (c == 'N' || c == 'n') {
                    break;
                } else {
                    System.out.print("Please enter a valid choice (Y / N) : ");
                }
            }
            if (c == 'N' || c == 'n') {
                break;
            }
        }
    }
}
