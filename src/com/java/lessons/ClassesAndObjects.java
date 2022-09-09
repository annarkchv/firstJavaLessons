package com.java.lessons;

/*
У класса могут быть:
1. Данные. Называются полями класса
2. Действия, которые класс может совершать. Это методы класса
 */

public class ClassesAndObjects {

    public static void main(String[] args) {
        // Каждый из двух person, созданных здесь, является объектом класса Person (объявлен ниже)

        Person firstPerson = new Person();
        // Вызов методов класса Person на объекте
        /*
        Если бы поля класса Person не были отмечены как private, их было бы можно заполнить обращением через точку,
        но так делать не рекомендуется:

        firstPerson.name = "John Doe";
        firstPerson.age = 25;
        */
        firstPerson.setName("John Doe"); // переменные из класса Person заполняются методами
        firstPerson.setAge(25); // переменные из класса Person заполняются методами
        firstPerson.sayHello();
        firstPerson.speak();
        System.out.println(firstPerson.getName()); // получение значения переменной из геттера
        System.out.println(firstPerson.getAge()); // получение значения переменной из геттера


        Person secondPerson = new Person();
        secondPerson.setName("Jane Doe");
        secondPerson.setAge(27);
        secondPerson.speak();

    }
}

// Объявление класса Person
class Person {
    // Поля класса
    private String name;
    private int age;

    // Чтобы получить доступ к private переменным из вне, нужно использовать сеттеры и геттеры (ничего не поняла про них)
    public void setName(String userName) { // это сеттер
        name = userName;
    }
    public String getName() { // это геттер
        return name;
    }

    public void setAge(int userAge) {
        age = userAge;
    }
    public int getAge() {
        return age;
    }


    // В методе void - это тип возвращаемого значения, как String, int и т.д.
    // Именно void означает "ничто", т.е. он ничего не возвращает
    void speak() {
        System.out.println("My name is " + name + ". I am " + age);
    }

    void sayHello() {
        for (int i = 0; i < 3; i ++) { // В методах класса можно создавать циклы
            System.out.println("Hello!");
        }
    }


}
