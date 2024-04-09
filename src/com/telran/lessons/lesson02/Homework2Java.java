package com.telran.lessons.lesson02;

public class Homework2Java {
    public static void main(String[] args) {
        short a = 50;
        short b = 10;
        short c = 5;
        System.out.println("Сумма: "+ (a+b+c));
        System.out.println("Разница: "+ (a-b-c));
        System.out.println("Умножение: "+ (a*b*c));
        System.out.println("Деление: "+ (a/b/c));

        //Остаток от деления
        System.out.println(a%b);
        System.out.println(a%c);
        System.out.println(b%c);
    }

}
