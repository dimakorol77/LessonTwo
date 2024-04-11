package com.telran.lessons.lesson04;

import java.util.Scanner;

public class Homework4_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слово:");
        String firstWord = scanner.nextLine();
        System.out.println("Введите второе слово:");
        String secondWord = scanner.nextLine();

        System.out.println("Новое слово: "
                + firstWord.substring(0, firstWord.length() / 2)
                + secondWord.substring(secondWord.length() / 2));
    }
}
