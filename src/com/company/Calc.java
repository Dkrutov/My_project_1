package com.company;
import java.util.Scanner;
/**
 * Created by Dmitriy on 21.02.23
 * Этот класс базовый для калькулятора
 * @author Dmitry Krutov
 * @see #
 * @see #main(String[])
 */
public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое значение: ");
        double a = scanner.nextDouble();
        System.out.println("Введите второе значение: ");
        double b = scanner.nextDouble();
        System.out.println("Вы ввели первое значение: " + a  + "\nВы ввели первое значение: " + b);
        System.out.println("Выберите тип операции с числами: ");
        double с = a + b;
        System.out.printf("Сложение: %.4f",с);    }

    public String calc() {
        return "";
    }
}
