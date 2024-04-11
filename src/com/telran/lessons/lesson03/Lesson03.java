package com.telran.lessons.lesson03;

import java.util.Scanner;

public class Lesson03 {
    //1. Создать объект Scanner
    //2. Получить от пользователя строку
    //3. Получить от пользователя число
    //4. Получить от пользователя булеан значение 
    //5. Получить от пользователя длинное число
    //6. Получить от пользователя дробное число



    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите строку");
//        String s = scanner.nextLine();
//        System.out.println(s);
//        System.out.println("Ввведите число");
//        int i = scanner.nextInt();
//        System.out.println(i);
//        System.out.println("введите true or false");
//        boolean b  = scanner.nextBoolean();
//        System.out.println(b);
//        System.out.println("введите длинное число");
//        long l = scanner.nextLong();
//        System.out.println(l);
//        System.out.println("Введите дробное число");
//        double d = scanner.nextDouble();
//        System.out.println(d);
/////////////////////////////////////////////////////////////////////////////
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите первое число: ");
//        long firstNumber = scanner.nextLong();
//
//        System.out.println("Введите второе число: ");
//        long secondNumber = scanner.nextLong();
//
//        System.out.println("Сумма: " + (firstNumber + secondNumber));
//        System.out.println("Разность: " + (firstNumber - secondNumber));
//        System.out.println("Произведение: " + (firstNumber * secondNumber));
//        System.out.println("Частное: " + (firstNumber / secondNumber));
//////////////////////////////////////////////////////////////////////////
        // 5x + 10y = ?
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите первое число X");
//        int FirstNumber =scanner.nextInt();
//        System.out.println("Введите второе число Y");
//        int SecondNumber= scanner.nextInt();
//        int result = 5 * FirstNumber + 10 * SecondNumber;
//
//        // Display the result
//        System.out.println("5x + 10y = " + result);
        ///////////////////////////////////////////////////////////////

        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите радиус окружности: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;

        System.out.print("Площадь окружности:" + area);

    }


    }

