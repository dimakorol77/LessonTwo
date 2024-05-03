package com.telran.lessons.lesson05;

import java.util.Random;

public class Lesson05 {


        public static void main(String[] args) {
            Random random = new Random();

            // Минимальная и максимальная температура
            int minTemperature = -20;
            int maxTemperature = 30;

            // Генерация температур для трёх дней
            int todayTemperature = random.nextInt(maxTemperature - minTemperature + 1) + minTemperature;
            int tomorrowTemperature = random.nextInt(maxTemperature - minTemperature + 1) + minTemperature;
            int dayAfterTomorrowTemperature = random.nextInt(maxTemperature - minTemperature + 1) + minTemperature;

            // Вывод температур
            System.out.println("Прогноз температуры на сегодня: " + todayTemperature + "°C");
            System.out.println("Прогноз температуры на завтра: " + tomorrowTemperature + "°C");
            System.out.println("Прогноз температуры на послезавтра: " + dayAfterTomorrowTemperature + "°C");
        }
    }


