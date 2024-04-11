package com.telran.lessons.lesson04;

import java.util.Scanner;

public class Homework4_1 {
    //Не обязательное
    //Напишите программу, которая запрашивает имя пользователя и выводит на экран «Добрый день <…….. !>».
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        System.out.println("Добрый день, " + name + "!");
        System.out.println("Ваше имя начинается с символа '" + name.charAt(0) +
                "' и заканчивается на символ '" + name.charAt(name.length() - 1) + "'");
    }
    }

