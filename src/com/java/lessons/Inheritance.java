package com.java.lessons;

public class Inheritance {

    public static void main(String[] args) {

        Animal firstAnimal = new Animal();
        Dog firstDog = new Dog();
        Cat firstCat = new Cat();

        firstAnimal.eat();
        firstDog.bark();
        firstDog.eat();
        firstCat.sleep();
    }
}

class Animal {

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {

    public void bark() {
        System.out.println("Dog is barking");
    }

    public void eat() { // изменение родительского метода
        System.out.println("Dog is eating");
    }
}

class Cat extends Animal {}
