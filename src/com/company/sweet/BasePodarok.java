package com.company.sweet;

import java.util.Scanner;

/**
 * Created by Dmitriy on 21.02.23
 * Этот класс базовый для калькулятора
 * @author Dmitry Krutov
 * @see #
 */
/*
*Формируется сладкий подарок.
- Он может включать в себя разные сладости (Candy, Jellybean, etc.)
- У каждой сладости есть название, вес, цена и свой уникальный параметр
- Необходимо собрать подарок из сладостей
- Найти общий вес подарка, общую стоимость подарка
- Вывести на консоль информацию о всех сладостях в подарке
*/

public class BasePodarok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double sum = 0.00;
        Double ves = 0.00;
        System.out.println("Введите количество сладостей:");
        int arrayCount = scanner.nextInt();
        Podarok[] box = new Podarok[arrayCount];
        int count=0;


        System.out.println("Введите цифру, где: ");
        System.out.println("'1' - Конфета 1");
        System.out.println("'2' - Шоколад 2");
        System.out.println("'3' - Мармелад 1");
        System.out.println("'4' - Шоколад 1");


        while ((arrayCount > 0)) {
            int numSweet = scanner.nextInt();
            System.out.println("Ожидание цифры");

            switch (numSweet){
                case 1:
                    System.out.println("INFO: 1");
                    Candy candy1 = new Candy("Candy1", 1.0, 5.0, "011");
                    box[count]=candy1;
                    System.out.println("INFO: count " + count);
                    System.out.println("INFO: count " + box[count]);
                    count=count + 1;
                    arrayCount=arrayCount-1;
                    break;
                case 2:
                    System.out.println("INFO: 2");
                    Chocolate chocolate1 = new Chocolate("Milka", 5.0, 15.0, "022");
                    box[count]=chocolate1;
                    System.out.println("INFO: count " + count);
                    System.out.println("INFO: count " + box[count]);
                    count=count + 1;
                    arrayCount=arrayCount-1;
                    break;
                case 3:
                    System.out.println("INFO: 3");
                    Jellybean jellybean1 = new Jellybean("Vkus", 4.0, 8.0, "031");
                    box[count]=jellybean1;
                    System.out.println("INFO: count " + count);
                    System.out.println("INFO: count " + box[count]);
                    count=count + 1;
                    arrayCount=arrayCount-1;
                    break;
                case 4:
                    System.out.println("INFO: 4");
                    Chocolate chocolate2 = new Chocolate("Alpina", 2.0, 6.0, "021");
                    box[count]=chocolate2;
                    System.out.println("INFO: count " + count);
                    System.out.println("INFO: count " + box[count]);
                    count=count + 1;
                    arrayCount=arrayCount-1;
                    break;
                default: System.out.println("Недобор сладостей! Выберите цифру 1-4");

            }


        }






        int size = box.length;
        System.out.println("INFO: size \n" + size);

        for (Podarok somePodarok : box) {
            System.out.println(somePodarok.toString());
        }


        for (int i=0;i<size;i++) {
            ves = ves + box[i].weight;
        }


        for (int i=0;i<size;i++) {
            sum = sum + box[i].price;
        }

        System.out.println("\nВес сладостей = " + ves);
        System.out.println("\nОбщая сумма = " + sum);


    }
}
