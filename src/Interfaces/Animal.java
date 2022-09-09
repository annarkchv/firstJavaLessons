package Interfaces;

// Если какой-то класс реализует интерфейс, то он обязан использовать те методы, которые есть в этом интерфейсе
public class Animal implements Info { //добавление интерфейса в класс

    private String name;
    private String greeting;

    public Animal(String name, String greeting) {
        this.name = name;
        this.greeting = greeting;
    }

    @Override
    public void showName() { // реализация для разных классов (Human и Animal может быть разной, хотя метод один)
        System.out.println("Animal\'s name is " + this.name);
    }

    @Override
    public void sayHello() { // реализация для разных классов (Human и Animal может быть разной, хотя метод один)
        System.out.println("Animal says " + this.greeting);
    }
}
