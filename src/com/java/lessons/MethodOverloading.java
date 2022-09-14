package com.java.lessons;

public class MethodOverloading {

    public static void main(String[] args) {

        System.out.println(MethodOverloading.sumParams(1, 1));
        System.out.println(MethodOverloading.sumParams(1));

        System.out.println(MethodOverloading.getHiddenCard("1234567812345678", 2));
        System.out.println(MethodOverloading.getHiddenCard("1234567812345678"));

    }




//    Можно определить два метода с одинаковыми именами
//    Это можно использовать для добавления значений по умолчанию
//    Чтобы не дублирвоать код, сначала нужно создать метод с наибольшим количеством параметров
//    А потом вызвать его внутри другого метода, указав значение по умолчанию

//    Этот метод принимает два параметра - a и b
    public static int sumParams(int a, int b) {
        return a + b;
    }

//    Этот метод принимает только один параметр
//    В теле вызывается первый метод. В качестве второго параметра передается 10
    public static int sumParams(int a) {
        return sumParams(a, 10);
    }




//    Второй пример перегрузки методов
    public static String getHiddenCard(String cardNumber, int asteriskAmount) {
        String lastFourDigits = cardNumber.substring(12);
        String asterisk = "*".repeat(asteriskAmount);

        return asterisk + lastFourDigits;

    }

    public static String getHiddenCard(String cardNumber) {
        return MethodOverloading.getHiddenCard(cardNumber, 4);

    }

}
