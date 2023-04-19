package com.company.lesson3;

import java.util.Scanner;

/**
 * Created by Dmitriy on 21.02.23
 * рограмма должна выполнять одно из заданий на выбор.
 *  Если в консоли ввести 1 - запуститься выполнение калькулятора,
 *  если 2 - поиск максимального слова в массиве.
 * @author Dmitry Krutov
 * @see #
 * @see #main(String[])
 */
public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите задачу: \n -Если в консоли ввести 1 - запуститься выполнение калькулятора \n -Если в консоли ввести 2 - запуститься поиск максимального слова в массиве.");
        int numTask = scanner.nextInt();
        if (numTask==1) {
            numTask=1;
            System.out.println("Введено: " + numTask);
            System.out.println("Калькулятор");
            Calc.calculate();
        } else if (numTask==2) {
            numTask=2;
            System.out.println("Введено: " + numTask);
            System.out.println("Поиск максимального элемента массива");
            MaxElement.lenArray();
        } else {
            System.out.println("Вы ввели не верный символ в консоль");
        }
    }
}
