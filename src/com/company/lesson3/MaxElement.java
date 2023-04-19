package com.company.lesson3;
import java.util.Scanner;
/**
 * Created by Dmitriy on 21.02.23
 * Этот класс базовый для поиска максимального числа
 * @author Dmitry Krutov
 * @see #
 * @see #
 */

public class MaxElement {
    public static void lenArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int sizeArray = scanner.nextInt();
        System.out.println("Вы ввели: " + sizeArray );
        System.out.println("Массив заполняется");
        String[] ArrayWord = new String[sizeArray];
        for (int i=0;i<sizeArray;i++) {
            System.out.println("Введите " + i + " элемент массива");
            ArrayWord[i]=scanner.next();
        }
        System.out.println("Массив заполнен!");
        int maxCount = 0;
        String maxWords = "";
        for (int i=0;i<sizeArray;i++) {

            int lenArrayWord=ArrayWord[i].length();
            System.out.println( i + " элемент массива: " + ArrayWord[i] + ". Число символов:" + lenArrayWord);

            if (lenArrayWord  > maxCount) {
                maxCount=lenArrayWord;
                maxWords=ArrayWord[i];
            }

        }
        System.out.println(" Максимальное число символов: " + maxCount);
        System.out.println(" Слово: " + maxWords);



    }
}
