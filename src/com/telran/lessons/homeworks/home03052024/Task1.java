package com.telran.lessons.homeworks.home03052024;

public class Task1 {
      /*  Создайте две переменные isEdekaOpen и isReweOpen, значения которых
зависят от того, открыты магазины или нет.
a. Реализует логический метод canBuy, возвращающий boolean
b. Значение этой переменной должно быть true, если хотя бы один
магазин открыт, иначе false.
c. Отобразите строку «Я могу купить еду, это ……» и значение.*/
    static boolean isEdekaopen = true;
    static boolean isReweOpen = false;
    public static void main(String[] args) {
        System.out.println("Я могу купить еду, это" + " "+ canBuy(isEdekaopen, isReweOpen)); ;
    }


    public static boolean canBuy( boolean a, boolean b) {
     return   a ||  b;

    }
}
