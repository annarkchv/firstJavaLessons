package com.java.lessons;

public class Arrays {

    public static void main(String[] args) {

        int[] numbers = new int[5]; // создание нового массива из 5 элементов с названием numbers
        // после создания все элементы массива = 0

        for (int i = 0; i < numbers.length; i++) { // инициализация массива через цикл for
            numbers[i] = i * 10;
        }




        String[] strings = {"sun", "rain", "snow", "fog"}; // инициализация массива через фигурные скобки

        for (int i = 0; i < strings.length; i++) { // просмотр элементов массива
            System.out.println(strings[i]);
        }




        // Просмотр всех элементов массива через цикл for each
        for (int i:numbers) { // int - тип данных, i - переменная, numbers - название массива
            System.out.println(i);
        }

        for (String i:strings) {
            System.out.println(i);
        }




        // Сумма элементов массива через цикл for each
        int sum = 0;
        for (int i:numbers) {
            sum += i;
        }
        System.out.println(sum);
    }
}
