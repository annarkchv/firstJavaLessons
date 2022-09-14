package qa.guru.variables;

import java.time.LocalDate;

public class JavaLearning {

    public static void main(String[] args) {

        LocalDate date; // объявление переменной date
        RandomDate randomDate = new RandomDate(); // создание объекта класса RandomDate

//        Вызов метода generateDefaultDate(), заданного в классе RandomDate
//        При каждом вызове будет отображать разные даты
        System.out.println("Random date: " + randomDate.generateDefaultDate());
        System.out.println("Random date: " + randomDate.generateDefaultDate());


//        Присвоение переменной date результата вызова метода generateDefaultDate()
//        При каждом вызове переменной дата будет одинаковой
        date = randomDate.generateDefaultDate();
        System.out.println("Date from variable: " + date);
        System.out.println("Date from variable: " + date);


//        Генерация даты в заданных пользователем промежутках
        LocalDate userDate;
        userDate = randomDate.dayBounds(1, 2).monthBounds(1, 2).yearBounds(2022, 2023).generateUserDate();
        System.out.println("User date: " + userDate);

    }

}
