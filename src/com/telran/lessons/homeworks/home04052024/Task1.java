package com.telran.lessons.homeworks.home04052024;

import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int y = 0;

        while (true) {
            String s = scanner.nextLine();
            if (s.equals("exit")) {
                return;
            } else {
                switch (s) {
                    case "up":
                        y++;
                        System.out.println("Вверх");
                        break;
                    case "down":
                        y--;
                        System.out.println("вниз");
                        break;
                    case "right":
                        x++;
                        System.out.println("Вправо");
                        break;
                    case "left":
                        x--;
                        System.out.println("Влево");
                        break;
                    case "lock":
                        System.out.println("Наши координаты" + " " + x + " " + y);
                        break;
                    default:
                        System.out.println("Вы  не нажали нужные кнопки");

                }


            }
        }
    }
}
