package com.telran.lessons.lesson05;


    //написать перегруженный метод generateTemperature(int minTemp, int maxTemp)
    public class Lesson {
        public static void main(String[] args) {
            int min = 1;
            int max = 10;
            int randomNum = (int)(Math.random() * (max - min + 1) + min); // число [0.0; 1.0)
            System.out.println("Случайное число от " + min + " до " + max + ": " + randomNum);

            printWeatherForecast();
        }

        public static void printWeatherForecast() {
            System.out.println("Сегодня: " + generateTemperature());
            System.out.println("Завтра: " + generateTemperature());
            System.out.println("Послезавтра: " + generateTemperature());
        }

        public static int getTodayWeather() {
            return generateTemperature();
        }

        public static int generateTemperature() {
            int minTemp = -21, maxTemp = 31;
            return (int) (Math.random() * (maxTemp - minTemp + 1) + minTemp);
        }
        public static int generateTemperature(int min, int max) {
            return (int) (Math.random() * (max - min + 1) + min);
        }

        // написать перегруженный метод generateTemperature(int minTemp, int maxTemp)
    }

