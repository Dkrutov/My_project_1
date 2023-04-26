package com.company.sweet;
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
        Candy candy1 = new Candy("Candy1", 1.0, 5.0, "011");
        Chocolate chocolate1 = new Chocolate("Alpina", 2.0, 6.0, "021");
        Chocolate chocolate2 = new Chocolate("Milka", 3.0, 7.0, "022");
        Jellybean jellybean1 = new Jellybean("Vkus", 4.0, 8.0, "031");
        Podarok[] box =  {candy1,chocolate1,chocolate2,jellybean1};
        for (Podarok somePodarok : box) {
            System.out.println(somePodarok.toString());
        }
        Double ves = 0.00;
        int size = box.length;
        for (int i=0;i<size;i++) {
            ves = ves + box[i].weight;
        }
        Double sum = 0.00;

        for (int i=0;i<size;i++) {
            sum = sum + box[i].price;
        }
        System.out.println("Вес сладостей = " + ves);
        System.out.println("Общая сумма = " + sum);


    }
}
