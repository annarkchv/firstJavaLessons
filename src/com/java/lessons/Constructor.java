package com.java.lessons;

public class Constructor {

    public static void main(String[] args) {

        /*
        При создании нового объекта класса NewHuman без параметров конструктор вызывается по умолчанию всегда
        NewHuman firstNewHuman = new NewHuman();
        Но дефолтный конструктор можно переопределить руками
        */

        // этот объект создастся с переданными значениями
        NewHuman firstHuman = new NewHuman("Jake Johnson", 25);
        firstHuman.getInfo();

        // этот - со значениями по умолчанию
        NewHuman secondHuman = new NewHuman();
        secondHuman.getInfo();
    }
}

class NewHuman {

    private String name;
    private int age;

    /*
    У конструктора нет типа возвращаемых данных, его название должно совпадать с названием класса
    Так выглядит дефолтный конструктор:
    public NewHuman() {    }

    Дефолтный конструктор можно переопределить руками, но дефолтный при этом продолжит работать.
    Он будет вызываться, если новому объекту класса при создании не будут переданы никакие параметры.
    Таким образом можно задать дефолтные значения для объекта
    */

    public NewHuman(String name, int age) { // это мой конструктор
        this.name = name;
        this.age = age;
    }

    public NewHuman() { // это дефолтный, которому я присвоила значения по умолчанию
        name = "John Doe";
        age = 18;
    }

    public void getInfo() {
        System.out.println(name + ", " + age);
    }
}
