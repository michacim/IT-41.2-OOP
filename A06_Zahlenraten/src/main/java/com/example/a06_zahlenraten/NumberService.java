package com.example.a06_zahlenraten;

import java.util.Random;

public class NumberService {


    /**
     *
     * @param size
     * @return Array mit Größe siehe size z.B. [1,2,3,4] -> size = 4
     */
    public static int[] createNumberList(int size){
        int[] numberList = new int[size];
        for (int i = 0; i < size ; i++) {
            numberList[i] = i +1;
        }
        return numberList;
    }


    public static int randomNumber(int[] arr){
         Random r = new Random();
         return arr[r.nextInt(arr.length)];

    }

}
