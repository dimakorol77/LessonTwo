package com.telran.lessons.lesson15;

public class Test {
        public static void main(String[] args) {
            // Создание экземпляра Zoo
            Zoo zoo = new Zoo();

            // Создание экземпляра Monkey
            Zoo.Monkey monkey = zoo.new Monkey();

            // Создание экземпляра Banana
            Zoo.Monkey.Banana banana = monkey.new Banana();

            // Печать сорта банана
            System.out.println(banana.getSort());
        }
    }
