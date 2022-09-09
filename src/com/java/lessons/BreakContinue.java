package com.java.lessons;

public class BreakContinue {

    public static void main(String[] args) {
        int i = 0;
        while (true) { // бесконечный цикл
            if (i == 15) { // break прервет цикл, когда i будет равно 15
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("The cycle is over");

        for (int j = 0; j <= 15; j++) {
            if (j % 2 == 0) { // числа, которые делятся на 2 без остатка, будут пропущены
                continue;
            }
            System.out.println(j + " is odd number"); // сюда попадут только нечетные
        }
    }
}
