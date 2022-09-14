package qa.guru.variables;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CurrentDateFormatting {

    public static void main(String[] args) {

//        Работа с текущей датой
        System.out.println(LocalDate.now()); // отображение текущей даты
        System.out.println(LocalDate.now().plusDays(5)); // текущая дата + 5 дней
        System.out.println(LocalDate.now().getMonth()); // текущий месяц


//        Форматирование даты
        LocalDate currentDate = LocalDate.now(); // создание переменной с текущей датой

        String datePattern = "dd.MM.yyyy"; // создание паттерна форматирования
        String formattedDate = currentDate.format(DateTimeFormatter.ofPattern(datePattern)); // в параметр передать паттерн форматирования

        System.out.println(formattedDate);

    }
}
