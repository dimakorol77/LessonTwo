package com.telran.lessons.lesson04;

public class Homework4 {
    //Создайте методы с математическими операциями +, -, *, /
    //Каждый метод принимает два числа в параметрах и возвращает результат
    //Вызовите все методы в main
    //Результат распечатайте в консоль
    public static void main(String[] args) {
        System.out.println(sum(7, 5));
        System.out.println(sub(7, 5));
        System.out.println(multi(7, 5));
        System.out.println(div(7, 5));
    }

    public static double sum(double a, double b) {
        return a + b;
    }
    public static double sub(double a, double b) {
        return a - b;
    }
    public static double multi(double a, double b) {
        return a * b;
    }
    public static double div(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException( "Деление на 0 невозможно.Введите другое число");
        }

    }
}
