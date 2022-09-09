package com.java.lessons;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int userInt;
        do {
            System.out.println("Enter number 5");
            userInt = userInput.nextInt();
        } while (userInt != 5);

        System.out.println("You have entered number 5");
    }
}
