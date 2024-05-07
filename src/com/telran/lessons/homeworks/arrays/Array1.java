package com.telran.lessons.homeworks.arrays;

import java.util.Random;

public class Array1 {
    public static void main(String[] args) {
        //Создайте массив из 8 случайных целых чисел из интервала [1;50]
        //Выведите массив на консоль в строку.
        //Замените каждый элемент с нечетным индексом на ноль.
        //Снова выведете массив на консоль в отдельной строке.
        int[] arr = new int[8];
        Random random = new Random();
        System.out.println("Заполняем массив значениями");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = 0;

            }
        }
        System.out.println("Измененный массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
