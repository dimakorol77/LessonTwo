package com.telran.lessons.lesson08;

public class Counter {

    public static void main(String[] args) {
        System.out.println("Вперед:");
        for (int count = 1; count <= 10; count++) {
            System.out.println(count);
        }

        System.out.println("Назад:");
        for (int count = 10; count >= 1; count--) {
            System.out.println(count);
        }
    }
}

