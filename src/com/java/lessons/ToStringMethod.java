package com.java.lessons;

public class ToStringMethod {

    public static void main(String[] args) {

        Product firstProduct = new Product("Water", 5);
        /*
        При выводе в печать объекта класса (System.out.println(firstProduct))
        на экран выведется его хэш-код (id) -> Product@568db2f2
        Это происходит из-за того, что по умолчанию к объекту применяется метод ToString()
        Если такое поведение не подходит, то его можно переопределить.
        После переопределения метод будет работать, как описано

         */
        System.out.println(firstProduct);

    }
}

class Product {
    private String name;
    private int price;

    public Product (String name, int price) {
        this.name = name;
        this.price = price;
    }

    // Переопределение метода toString()
    public String toString() {
        return name + ", " + price;
    }
}
