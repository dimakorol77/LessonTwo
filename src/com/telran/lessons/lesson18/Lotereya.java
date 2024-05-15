package com.telran.lessons.lesson18;

import java.util.Arrays;

import static com.telran.lessons.lesson18.Constants.*;
import static com.telran.lessons.lesson18.Utils.*;

public class Lotereya {
    public  void start () {

        int[] userArr = getUserNumbers(NUM_OF_LUCKY_NUMBERS,MIN,MAX);
        int[] winNumbers = getWinNumbers(NUM_OF_LUCKY_NUMBERS, MIN,MAX);


        System.out.println("User's numbers: " );
        printArray(userArr);
        System.out.println("Win numbers array:" );
        printArray(winNumbers);
        System.out.println("Вы угадали " + compareWinNumbers(userArr, winNumbers));
    }

}


