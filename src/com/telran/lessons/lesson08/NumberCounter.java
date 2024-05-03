package com.telran.lessons.lesson08;
import java.util.Scanner;


public class NumberCounter {


        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//
//            int positiveCount = 0;  // Счётчик положительных чисел
//            int negativeCount = 0;  // Счётчик отрицательных чисел
//            int number;             // Переменная для хранения введенного числа
//
//            System.out.println("Введите числа (0 для завершения):");
//
//            while (true) {
//                number = scanner.nextInt();
//
//                if (number == 0) {
//                    break;
//                }
//
//                if (number > 0) {
//                    positiveCount++;
//                } else if (number < 0) {
//                    negativeCount++;
//                }
//            }
//
//            System.out.println("Количество положительных чисел: " + positiveCount);
//            System.out.println("Количество отрицательных чисел: " + negativeCount);


                    int[] numbers = {13, 22, 35, 48, 51}; // Заданный массив чисел
                    int evenCount = 0;
                    int oddCount = 0;

                    for (int num : numbers) {
                        if (num % 2 == 0) {
                            evenCount++;
                        } else {
                            oddCount++;
                        }
                    }


                    System.out.println("Количество чётных чисел: " + evenCount);
                    System.out.println("Количество нечётных чисел: " + oddCount);
                }
            }







