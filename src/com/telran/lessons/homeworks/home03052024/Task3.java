package com.telran.lessons.homeworks.home03052024;

import java.util.Scanner;

public class Task3 {
    //Реализуйте программу, которая попросит пользователя ввести три целых
    //числа (используйте сканер) и напечатает максимум из трех чисел.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 целых числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max;

        // Определение максимального числа с помощью if
        if (a > b) {
            if (a > c) {
                max = a; // a больше b и c
            } else {
                max = c; // c больше a и b
            }
        } else {
            if (b > c) {
                max = b; // b больше a и c
            } else {
                max = c; // c больше a и b, или равен b
            }
        }

        // Вывод максимального числа
        System.out.println("Максимальное число из введенных: " + max);



    }

}
