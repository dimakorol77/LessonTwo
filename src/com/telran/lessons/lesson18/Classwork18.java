package com.telran.lessons.lesson18;
import java.util.Random;
import java.util.Scanner;

public class Classwork18 {
    public static void main(String[] args) {
  //Реализовать простую лотерею, используя конструкцию if-else-if:
        //Создать класс для лотереи
        //В методе main() реализовать лотерею
        //Добавить переменные для выигрышных номеров (5 номеров)
        //Добавить переменные для номеров пользователя
        //Получить от пользователя 5 номеров, используем Сканер
        //Ограничить игровые номера от 1 до 50
        //Рандомально присвоить в переменные выигрышные номера
        //Распечатать на консоль номера лотереи и номера введенные пользователем


                Random random = new Random();
                Scanner scanner = new Scanner(System.in);

                int[] winningNumbers = new int[5];

                int[] userNumbers = new int[5];

                for (int i = 0; i < 5; i++) {
                    winningNumbers[i] = random.nextInt(50) + 1;
                }

                System.out.println("Введите 5 чисел от 1 до 50:");
                for (int i = 0; i < 5; i++) {
                    while (true) {
                        System.out.print("Введите число " + (i + 1) + ": ");
                        int number = scanner.nextInt();
                        if (number >= 1 && number <= 50) {
                            userNumbers[i] = number;
                            break;
                        } else {
                            System.out.println("Число должно быть в диапазоне от 1 до 50");
                        }
                    }
                }
                System.out.print("Выигрышные номера: ");
                for (int number : winningNumbers) {
                    System.out.print(number + " ");
                }
                System.out.println();

                System.out.print("Ваши номера: ");
                for (int number : userNumbers) {
                    System.out.print(number + " ");
                }
                System.out.println();
            }
        }

