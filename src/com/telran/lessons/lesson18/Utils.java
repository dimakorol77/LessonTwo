package com.telran.lessons.lesson18;

import java.util.Scanner;


public class Utils {
    public static boolean isArrContainNum(int number, int[] arr) {
        for (int item : arr) {
            if (item == number) {
                return true;
            }
        }
        return false;
    }
    public  static int compareWinNumbers (int [] userArr, int [] winNumberArr) {
        int counter =0;
        for (int i = 0; i <userArr.length ; i++) {
            if (isArrContainNum(userArr[i],winNumberArr)){
                counter++;
            }
        }
        return  counter;
    }
    public static int [] getWinNumbers (int lengthArray,int min, int max) {
        int[] winNumbers = new int[lengthArray];
        int lucky;
        int countLuckyNumber = 0;
        while (winNumbers.length > countLuckyNumber) {
            lucky = (int) (Math.random() * (max - min + 1) + min);
            if (!isArrContainNum(lucky, winNumbers)) {
                winNumbers[countLuckyNumber] = lucky;
                countLuckyNumber++;
            }
        }
        return  winNumbers;
    }
    public static int [] getUserNumbers (int lengthArray,int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int [] userArr = new int[lengthArray];
        int counterUserNumber =0;
        System.out.println("Введите 5 чисел ");
        while (userArr.length > counterUserNumber) {
            System.out.print((counterUserNumber + 1) +  " число : " );
            int userNumber = scanner.nextInt();
            if (!isArrContainNum(userNumber, userArr) && userNumber <= max && userNumber >= min) {
                userArr[counterUserNumber] = userNumber;
                counterUserNumber++;
            }
        }
        return userArr;
    }

    public static void  printArray (int [] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
