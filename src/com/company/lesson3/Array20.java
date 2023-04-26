package com.company.lesson3;

import java.util.Random;

public class Array20 {
    public static void main(String[] args) {
        int[] Array20 = new int[20];
        for (int i=0;i<20;i++) {
            Random r = new Random();
            Array20[i]=r.nextInt(21)-10;
            System.out.println("info: Элемент " + i + " равне: " + Array20[i]);
        }
        int max = 10;
        int min = -10;
        int maxArray = 0;
        int minArray = 0;
        int bufer = 0;
        for (int i=0;i<20;i++) {
            if (Array20[i] > 0 && Array20[i]<=max ) {
                max = Array20[i];
                maxArray = i;
            }

        }
        System.out.println("info: max " + max);
        System.out.println("info: maxArray " + maxArray);
        for (int i=0;i<20;i++) {
            if (Array20[i] < 0 && Array20[i]>=min ) {
                min = Array20[i];
                minArray = i;
            }

        }
        System.out.println("info: min " + min);
        System.out.println("info: minArray " + minArray);
        bufer = Array20[minArray];
        Array20[minArray] = Array20[maxArray];
        Array20[maxArray] = bufer;
        for (int i=0;i<20;i++) {
            System.out.println("info: Элемент " + i + " равне: " + Array20[i]);
        }

    }
}
