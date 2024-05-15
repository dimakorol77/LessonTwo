package com.telran.lessons.lesson17;

public class Classwork17 {
    public static void main(String[] args) {
//        int [][] arr = new int[3][3];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = (i + 1) * (j + 1);
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }
        ////////////////////////////////////////////////////////////'
//        int num =22;
//        int [] arr= {3,1,24,55,,6,22,77};
//        for (int i = 0; i <arr.length ; i++) {
//            if(arr[i]== num){
//                System.out.println(i);
//
//
//            }
//        }
//        public static int linearSearch(int[] arr, int num) {
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] == num) {
//                    return i;
//                }
//            }
//            return -1;
//        }
        /*
        * public static int binarySearch(int[] arr, int num) {
    int firstIdx = 0;
    int lastIdx = arr.length - 1;

    while(firstIdx <= lastIdx) {
        int midIdx = (lastIdx + firstIdx) / 2;
        if (arr[midIdx] == num) {
            return midIdx;
        } else if (arr[midIdx] < num) {
            firstIdx = midIdx + 1;
        } else if (arr[midIdx] > num) {
            lastIdx = midIdx - 1;
        }
    }

    return -1;
} */

        ////Создайте 5 объектов типа Car
        ////        Объект Car должен содержать поля
        ////private double price;
        ////private String model;
        ////        и конструктор с этими полями
        //
        //
        //
        //public class Car {
        //    private double price;
        //    private String model;
        //
        //    public Car (double price, String model) {
        //        this.price = price;
        //        this.model = model;
        //    }
        //
        //    @Override
        //    public String toString () {
        //        return this.model + " " + this.price;
        //    }
        //
        //    public double getPrice() {
        //        return price;
        //    }
        //
        //    public String getModel() {
        //        return model;
        //    }
        //}
        //public static void main(String[] args) {
        //    Car [] cars = new Car[] {
        //            new Car(1.5, "bwm 530i"),
        //            new Car (21, "volvo s80"),
        //            new Car (10, "ford focus"),
        //            new Car (5.7, "app mustang")
        //    };
        //
        //    for (int i = 0; i < cars.length; i++) {
        //        System.out.println(cars[i]);
        //
        //    }
        //
        //    System.out.println();
        //    System.out.println(Arrays.toString(bubbleSortCarsByPrice(cars)));
        //    System.out.println();
        //    System.out.println(Arrays.toString(bubbleSortCarsByModel(cars)));
        //
        //
        //
        //}
        //public class EvenArray {
        //
        //    public static void main(String[] args) {
        //        int [] evenArr = new int [10];
        //        int j = 0;
        //        for (int i = 2; i <= 20; i+=2){
        //            evenArr[j] = i;
        //            System.out.print(evenArr[j] + " ") ;
        //            j++;
        //
        //        }
        //
        //        System.out.println();
        //
        //        for (int i = evenArr.length -1; i >= 0; i-=1) {
        //
        //            System.out.println(evenArr[i]);
        //        }
        //
        //
        //    }
        //}
        //Создайте строку как литерал: str1 = “Java”
        //Создайте строку как литерал: str2 = “Java”
        //Создайте строку как Объект: str 3 = new (“Java”)
        //Создайте строку как Объект: str 4 = new (“Java”)
        //Сравните строки 1 и 2 используя == 
        //Сравните строки 1 и 2 используя equals
        //Сравните строки 3 и 4 используя == 
        //Сравните строки 3 и 4 используя equals
        //Сравните строки 1 и 3 используя == 
        //Сравните строки 1 и 3 используя equals
        //Проанализируйте результат
//        String str1 = "Java";
//        String str2 = "Java";
//        String str3 = new String("Java");
//        String str4= new String("Java");
//        System.out.println(str1==str2);
//        System.out.println(str3==str4);
//        System.out.println(str1==str3);
//        System.out.println(str1.equals(str2));
//        System.out.println(str3.equals(str4));
//        System.out.println(str1.equals(str3));


                // Создание объектов StringBuilder с использованием всех доступных конструкторов
                StringBuilder sb1 = new StringBuilder(); // конструктор без параметров
                StringBuilder sb2 = new StringBuilder("Hello"); // конструктор с начальным значением
                StringBuilder sb3 = new StringBuilder(10); // конструктор с начальной емкостью

                // Используем метод append для добавления строки к объекту sb1
                sb1.append("StartaUniversity");

                // Распечатываем все объекты на консоли
                System.out.println("sb1: " + sb1);
                System.out.println("sb2: " + sb2);
                System.out.println("sb3: " + sb3);

                // Применяем метод reverse() к объекту sb2
                sb2.reverse();

                // Распечатываем объект sb2 на консоли
                System.out.println("sb2 после применения reverse(): " + sb2);
            }
        }


