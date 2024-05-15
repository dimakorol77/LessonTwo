package com.telran.lessons.lesson16;
import java.util.Arrays;
import java.util.Random;

public class Test {
    //Создайте класс ручка (Pen)
    //Определите свойство color типа String с доступом private
    //Создайте методы getColor(); setColor(String newColor);
    //Создайте класс Test
    //Создайте три объекта типа Pen
    //Создайте массив L = 3
    //Сохраните все объекты в массив
    //Достаньте поочередно из массива ручки и измените цвет каждой на 
    //“Green”
    //“Red” 
    //“Black”
//    public static void main(String[] args) {
//        Pen pen1 = new Pen("red");
//        Pen pen2 = new Pen("green");
//        Pen pen3 = new Pen("black");
//
//        Pen[] pens = new Pen[3];
//
//        // Добавление объектов в массив
//        pens[0] = pen1;
//        pens[1] = pen2;
//        pens[2] = pen3;
//        for (int i = 0; i < pens.length; i++) {
//            System.out.println(pens[i].getColor());
//
//        }
//    public static void main(String[] args) {
//        int [] num = new int[99];
//        for (int i = 0; i <num.length ; i++) {
//            num[i]= i+1;
//        }
//        for (int i = num.length - 1; i >= 0 ; i--) {
//            System.out.println(num[i]);
//        }
//    }
    //// Создание массива нечетных чисел от 1 до 99
    //    int[] oddNumbers = new int[50];
    //    int oddN = 0;
    //    for (int i = 1; i <= 99; i += 2) {
    //        oddNumbers[oddN] = i;
    //        oddN++;
    //    }
    //
    //    // Вывод массива на экран в обратном порядке
    //    System.out.print("Массив нечетных чисел от 1 до 99 в обратном порядке: ");
    //    for (int i = oddNumbers.length -1; i >= 0; i--) {
    //        if (i > 0) {
    //            System.out.print(oddNumbers[i] + ", ");
    //        }else System.out.print(oddNumbers[0]);
    //    }
    //////////////// Создайте массив из 15 случайных целых чисел из отрезка [0;9]. 
    //Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.


//            Random random = new Random();
//            int[] numbers = new int[15];
//            int countEven = 0;
//
//            for (int i = 0; i < numbers.length; i++) {
//                numbers[i] = random.nextInt(10);
//                if (numbers[i] % 2 == 0) {
//                    countEven++;
//                }
//            }
//
//            System.out.println("массив:");
//            for (int number : numbers) {
//                System.out.print(number + " ");
//            }
//            System.out.println();
//
//
//            System.out.println("Количество четных чисел: " + countEven);


//                public static void main(String[] args) {
//                    String[] days = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
//
//                    System.out.println(days[6]);
//                }
//            }
//////////////////////////////////////////////////////////////Создать массив из 15 случайных элементов
//В массиве найти максимальный элемент
//
//В массиве найти максимальный элемент с четным индексом


    //        public static void main(String[] args) {
//            Random rand = new Random();
//            int[] array = new int[15];
//
//            // Заполняем массив случайными числами
//            for (int i = 0; i < array.length; i++) {
//                array[i] = rand.nextInt(20);  // Допустим, числа от 0 до 99
//            }
//
//            // Находим максимальный элемент в массиве
//            int maxElement = array[0];
//            for (int num : array) {
//                if (num > maxElement) {
//                    maxElement = num;
//                }
//            }
//
//            // Находим максимальный элемент с четным индексом
//            int maxEvenIndexElement = array[0];
//            for (int i = 0; i < array.length; i += 2) {  // Проходим только по четным индексам
//                if (array[i] > maxEvenIndexElement) {
//                    maxEvenIndexElement = array[i];
//                }
//            }
//
//            // Выводим массив и результаты
//            System.out.println("Массив: ");
//            for (int num : array) {
//                System.out.print(num + " ");
//            }
//            System.out.println("\nМаксимальный элемент: " + maxElement);
//            System.out.println("Максимальный элемент с четным индексом: " + maxEvenIndexElement);
//        }
//public static void main(String[] args) {
//    int min = 0;
//    int max = 100;
//
//    int maxNumber = 0;
//    int maxEvenNumber = 0;
//
//    int[] randomArr = new int[15];
//    Random random = new Random();
//    for (int i = 0; i < randomArr.length; i++) {
//        randomArr[i]  = random.nextInt(55);
//
//        if (randomArr[i] > maxNumber) {
//            maxNumber = randomArr[i];
//        }
//        if ((i % 2 ==0) && (randomArr[i] > maxEvenNumber)) {
//            maxEvenNumber = randomArr[i];
//        }
//    }
//    System.out.println(Arrays.toString(randomArr));
//    System.out.println("Max number:" + maxNumber);
//    System.out.println("Max even: " + maxEvenNumber);
//}

        // Рекурсивный метод для нахождения n-го числа Фибоначчи

            // Рекурсивный метод для нахождения n-го числа Фибоначчи
            public static int fibonacci(int n) {
                System.out.println("Вызов функции fibonacci(" + n + ")");
                if (n <= 1) {
                    System.out.println("Возврат: " + n);
                    return n;  // Базовый случай: 0 или 1 возвращает само значение n
                }
                int result = fibonacci(n - 1) + fibonacci(n - 2);  // Рекурсивный вызов
                System.out.println("Возврат: fibonacci(" + (n - 1) + ") + fibonacci(" + (n - 2) + ") = " + result);
                return result;
            }

            public static void main(String[] args) {
                 // Ищем 10-е число Фибоначчи
                System.out.println("10-е число Фибоначчи: " + fibonacci(7));
            }
        }

















































































