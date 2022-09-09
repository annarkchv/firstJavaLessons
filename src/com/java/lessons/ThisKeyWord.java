package com.java.lessons;

public class ThisKeyWord {

    public static void main(String[] args) {

        Human firstHuman = new Human();
        firstHuman.setName("Adam");
        firstHuman.setAge(18);
        firstHuman.getInfo();

    }
}

class Human {
    String name;
    int age;

    // в этом варианте получается, что для одной и той же по смыслу переменной есть два имени - humanName и name
    public void setName(String humanName) {
        name = humanName;
    }
    // в этом варианте используется this, чтобы изнутри метода указать на переменную класса
    // получается, что this.age указывает на переменную класса
    // а просто age - это значение переменной из параметров метода
    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }


    public void getInfo() {
        System.out.println(name + ", " + age);
    }
}
