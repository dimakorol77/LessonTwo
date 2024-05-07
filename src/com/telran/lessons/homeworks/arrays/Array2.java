package com.telran.lessons.homeworks.arrays;

import java.util.Arrays;
import java.util.Random;

public class Array2 {
    //Создайте массив из 5 случайных целых чисел из интервала [10;99]
    //Выведите его на консоль в строку.
    //Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        Random random = new Random();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(10, 100);
        }

        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] >= arr1[i + 1]) {
                System.out.println("Массив не является строго возрастающей последовательностью");
                return;


            }else System.out.println("Массив является строго возрастиющим");
        }
    }
}

