package com.java.lessons;

// StringBuilder позволяет изменять исходные строки
// Можно использовать вместо конкатенации для экономии памяти

public class StringBuilderClass {

    public static void main(String[] args) {
        StringBuilder myString = new StringBuilder("Hello");
        myString.append(" World").append("!");
        System.out.println(myString);
    }
}
