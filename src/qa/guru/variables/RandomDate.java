package qa.guru.variables;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class RandomDate {

    private int day;
    private int month;
    private int year;

//   Создание методов класса RandomDate

    public RandomDate dayBounds(int from, int to) {
        day = randomValue(from, to);
        return this; // this - это ссылка на объект, в рамках которого вызывается метод
    }

    public RandomDate monthBounds(int from, int to) {
        month = randomValue(from, to);
        return this; // this - это ссылка на объект, в рамках которого вызывается метод
    }

    public RandomDate yearBounds(int from, int to) {
        year = randomValue(from, to);
        return this; // this - это ссылка на объект, в рамках которого вызывается метод
    }

//    рандомные числа будут генериться с firstBound по (secondBound - 1)
    private int randomValue(int firstBound, int secondBound) {
        return ThreadLocalRandom.current().nextInt(firstBound, secondBound);
    }

//    При вызове метода generateDefaultDate() будет генерироваться дата в заданных в нем промежутках
    public LocalDate generateDefaultDate() {
        int day = randomValue(1, 29);
        int month = randomValue(1, 13);
        int year = randomValue(1900, 2023);

        return LocalDate.of(year, month, day);
    }

//    При вызове метода generateUserDate() будет генерироваться дата в промежутках, заданных пользователем
    public LocalDate generateUserDate() {
        return LocalDate.of(year, month, day);
    }
}
