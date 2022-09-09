package Interfaces;

public class Test {

    public static void main(String[] args) {

        Human human1 = new Human("Jack", "Hello!");
        Animal dog = new Animal("Bob", "Bark!");
        Animal cat = new Animal("Alice", "Meow!");

        human1.showName();
        human1.sayHello();
        dog.showName();
        dog.sayHello();
        cat.showName();
        cat.sayHello();

        // Тип переменной не совпадает с классом объекта
        // Переменная типа Info ссылается на объект класса Animal
        // Так можно сделать, потому что класс Human реализует интерфейс Info
        Info human2 = new Human("James", "Hi!");
        human2.sayHello();
        human2.showName();

        // Использование универсального метода
        outputInfo(human1);
        outputInfo(cat);

    }

    // Благодаря интерфейсам можно создать универсальный метод
    // Этот метод реализует интерфейс Info
    // После его ему в качестве параметров можно передавать любой из объектов, класс которого реализует интерфейс Info
    public static void outputInfo(Info info) {
        info.showName();
        info.sayHello();
        System.out.println("This is outputInfo method");

    }

}
