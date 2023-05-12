package com.linkedin.javacodechallenges;

import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothing {

    private static int pointsToStart = 10;
    private Scanner scanner = new Scanner(System.in);
    private Random rand = new Random();
    private int points = pointsToStart;
    private boolean continueGame = true;

    public void playGame() {

        System.out.println("Hello! You have " + pointsToStart + " points. Type Double if you want to play");
        this.continueGame = this.scanner.nextLine().equalsIgnoreCase("DOUBLE");

        while (this.continueGame) {
            if (this.rand.nextInt(2) == 0) {
                points = points * 2;
                System.out.println("You doubled your points! You have " + points + " points. Type Double if you want to continue");
                this.continueGame = this.scanner.nextLine().equalsIgnoreCase("DOUBLE");
            } else {
                System.out.println("You lost all your points :(");
                return;
            }

        }
        System.out.println("Final result: " + points +" points!");


    }
}
