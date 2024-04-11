package com.telran.lessons.lesson04;

import java.util.Scanner;

public class Lesson04 {
    public static void main(String[] args) {
        //неявное преобразование
        int i = 127; // - byte
        int i2 = 32000; // - short
        double d1 =i; // - byte
//        System.out.println(i);
//        System.out.println(i2);
//        System.out.println(d1);

        // явное преобразование

//        int i3 = 128;
//        byte b = (byte)i3;
//      //System.out.println(b);
        //Создать новую строку: “I study Java”
        //Вывести в консоль длину строки
        //Вывести в консоль часть строки “Java” используя substring
//        String s = "I study Java";
//        System.out.println(s.length());
//        System.out.println(s.substring(8,12));
        ////////////////////////////////////////
        /*Распечатать последний символ строки. Используем метод String.charAt().
        Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
        Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
    Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
    Найти позицию подстроки “Java” в строке “I like Java!!!”.
    Заменить все символы “а” на “о”. 
    Преобразуйте строку к верхнему регистру.
    Преобразуйте строку к нижнему регистру. */
//        String str = "I like Java!!!";
//        System.out.println("Последний символ: " + str.charAt(str.length() - 1));
//        System.out.println("Заканчивается на '!!!': " + str.endsWith("!!!"));
//        System.out.println("Начинается с 'I like': " + str.startsWith("I like"));
//        System.out.println("Содержит 'Java': " + str.contains("Java"));
//        System.out.println("Позиция 'Java': " + str.indexOf("Java"));
//        System.out.println("Замена 'а' на 'о': " + str.replace('a', 'o'));
//        System.out.println("Верхний регистр: " + str.toUpperCase());
//        System.out.println("Нижний регистр: " + str.toLowerCase());

        //Условие здачи: ввести 2 слова, состоящие из четного числа букв.
        // Получить слово состоящее из первой половины первого слова и второй половины второго слова.

//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите первое слово:");
//        String firstWord = scanner.nextLine();
//        System.out.println("Введите второе слово:");
//        String secondWord = scanner.nextLine();
//
//        System.out.println("Новое слово: "
//                + firstWord.substring(0, firstWord.length() / 2)
//                + secondWord.substring(secondWord.length() / 2));



    }
}
