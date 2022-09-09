package com.java.lessons;

public class StaticKeyWord {
    public static void main(String[] args) {

        /*
        City.description = "Ugly"; // можно переопределить
        System.out.println(City.description); // и потом снова вывести на экран
         */

        // Статиеские методы вызываются не на объекте класса, а на самом классе
        City.getDescription();

        City firstCity = new City("St. Petersburg");
        City secondCity = new City("Moscow");

        firstCity.getCityInfo(); // информация из переменной description будет относиться к обоим объектам
        secondCity.getCityInfo();

        City.getCityCounter(); // получение количества объектов класса
    }
}

class City {

    // Это переменная объекта класса
    // Именно объекта, т.к. без созданного объекта она не имеет смысла
    private String name;

    // Это переменная класса
    // Она не имеет прямого отношения к объектам и может существовать отдельно от них
    private static String description = "Beautiful";

    // Можно создавать статические методы
    public static void getDescription() {
        System.out.println(description);

    }

    // Из нестатических методов можно обращаться к статическим переменным
    public void getCityInfo() {
        System.out.println(name + ", " + description);
    }

    // Подсчет колиества объектов в классе
    private static int cityCounter;
    public City (String name){ // конструктор объекта класса
        this.name = name;
        cityCounter++; // при создании нового объекта класса значение переменной будет увеличиваться
    }
    public static void getCityCounter() {
        System.out.println(cityCounter);
    }
}
