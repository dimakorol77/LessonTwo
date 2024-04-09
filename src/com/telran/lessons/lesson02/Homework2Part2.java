package com.telran.lessons.lesson02;

public class Homework2Part2 {
    public static void main(String[] args) {
        int number = 345;
        int first = number/100;
        int second =(number/10)%10;
        int third = number%10;
        System.out.println("Число= "+ number + "-->" + first+", " +second+", " +third);
    }
}
