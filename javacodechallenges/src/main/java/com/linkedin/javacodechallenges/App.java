package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static boolean isPasswordComplex(String password) {
        // regex = "(.*[a-z].*)(.*[A-Z].*)(.*\\d.*)";
        return(password.matches(".*[a-z].*") && password.matches(".*[A-Z].*") && password.matches(".*\\d.*") && password.length()>=6);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? "
                + isPasswordComplex(userInput));

        scanner.close();
    }
}
