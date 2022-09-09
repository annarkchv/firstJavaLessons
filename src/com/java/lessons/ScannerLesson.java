package com.java.lessons;

import java.util.Scanner;

public class ScannerLesson {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a string:"); // строка, которая отобразится для пользователя
        String userString = userInput.nextLine(); // здесь программа ждет ввод строки с клавиатуры и нажатие на Enter
        System.out.println("You have entered: " + userString); // отобразит то, что ввел пользователь

        System.out.println("Enter a number:"); // строка, которая отобразится для пользователя
        int userInt = userInput.nextInt(); // здесь программа ждет ввод числа с клавиатуры и нажатие на Enter
        System.out.println("You have entered: " + userInt); // отобразит то, что ввел пользователь
    }
}
