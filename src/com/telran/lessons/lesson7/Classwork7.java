package com.telran.lessons.lesson7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Classwork7 {
    private static List<String> names = Arrays.asList(
                "Dima Korol", "Галина", "Dmitriy", "Eduard", "Jenya kotrini", "Bizness Time",
                "Mariya Berger", "Nur Nur", "Aleksandr D.", "Ксения", "Наташа Курсы Tel Ran",
                "Inna Degtairova", "Anna Канiвець", "Julia", "Nina", "Tolik Hololobov",
                "вадим", "Max Schneider", "Philipp", "Karina", "Max Glushenkov",
                "Christopher (Jurek Grinco)", "Ammar"
        );

        private static Random random = new Random();

        public static String getRandomName() {
            return names.get(random.nextInt(names.size()));
        }

        public static void main(String[] args) {
            System.out.println("Случайное имя: " + getRandomName());
        }
    }










