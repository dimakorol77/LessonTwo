package com.telran.lessons.lesson12;

import java.util.Scanner;

public class Classwork12 {
    //    public static void main(String[] args) {
//      method1(11);
//    }
//
//
//    public static int method1(int a) {
//        for (int i = 1; i < a; i++) {
//            System.out.println(i);
//
//        }
//        return a;
//
//    }
//}
//////////////////////////////////////////////////////////////
//public static void main(String[] args) {
//    for (int i = 0; i <5 ; i++) {
//        System.out.println("Hello my friend");
//    }
//
//    }
//}//////////////////////////////////////////////////////////

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        for (int i = 0; i <a ; i++) {
//            if (i%2==0){
//                System.out.println(i);
//            }
//
//        }
//    }
///////////////////////////////////////////////////////////////////


    //    public static void main(String[] args) {
//        int num1 = 5;
//        int num2 = 7;
//        int result = sumOfMaxEntries(num1, num2);
//        System.out.println("Результат " + result);
//    }
//
//    public static int sumOfMaxEntries(int a, int b) {
//        int max = Math.max(a, b);
//        int sum = 0;
//        for (int i = 1; i <= max; i++) {
//            sum += i;
//        }
//        return sum;
//    }
//}


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String input = scanner.nextLine();
//
//        // Проходим по каждому символу строки
//        for (int i = 0; i < input.length(); i++) {
//            char c = input.charAt(i);
//
//            // Игнорируем знаки препинания и пробелы
//            if (Character.isLetter(c)) {
//                System.out.print(c);
//                if (i < input.length() - 1) {
//                    System.out.print(",");
//                }
//            }
//        }
//    }
//}



//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число:");
//        String input = scanner.nextLine();  // Считываем строку, чтобы избежать проблем с вводом больших чисел
//        scanner.close();
//
//        int sum = 0;
//        for (int i = 0; i < input.length(); i++) {
//            // Преобразуем каждый символ строки в число и суммируем
//            sum += input.charAt(i) - '0';  // Вычитаем '0' для преобразования char в int
//        }
//
//        System.out.println("Сумма цифр: " + sum);
//    }
//}
//Напишите программу, которая принимает команды управления
//персонажем в текстовой игре (up, down, right, left).
//Используйте switch-case для обработки команд и
//изменения положения персонажа на карте или вывода сообщений о действиях персонажа.
//На команду loc должны выводиться текущие координаты.
//Изначально начинаем в точке с координатами 0,0


//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    int x=0;
//    int y = 0;
//
//    while (true){
//        String s= scanner.nextLine();
//        if (s.equals("exit")) {
//            break;
//        }
//    switch (s){
//        case "up":
//            y++;
//            System.out.println("Вверх");
//            break;
//        case "down":
//            y--;
//            System.out.println("вниз");
//            break;
//        case "right":
//            x++;
//            System.out.println("Вправо");
//            break;
//        case "left":
//            x--;
//            System.out.println("Влево");
//            break;
//        case "lock":
//            System.out.println(x +" "+ y);
//        default:
//            System.out.println("Не нажали на кнопки");
//    }
//
//
//        System.out.println();




        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите ваше имя: ");
            String name = scanner.nextLine();

            for (int i = 0; i < name.length(); i++) {
                char letter = name.charAt(i);
                System.out.println(letter + "Ammar");
            }

            scanner.close();
        }
    }








