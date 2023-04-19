package com.company.lesson3;
import java.util.Scanner;
/**
 * Created by Dmitriy on 21.02.23
 * Этот класс базовый для калькулятора
 * @author Dmitry Krutov
 * @see #
 * @see #
 */
public class Calc {
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое значение: ");
        double a = scanner.nextDouble();
        System.out.println("Введите второе значение: ");
        double b = scanner.nextDouble();
        System.out.println("Вы ввели первое значение: " + a  + "\nВы ввели первое значение: " + b);
        System.out.println("Выберите тип операции с числами: '+', '-', '*', '/'");
        char znak = scanner.next().charAt(0);
        System.out.println("Тип операции с числами: " + znak);
      if (znak == '+') {
            double с = a + b;
            System.out.printf("Сложение: %.4f",с);
        }
        else if (znak == '-') {
          double с = a - b;
          System.out.printf("Вычитание: %.4f",с);
        }
      else if (znak == '*') {
          double с = a * b;
          System.out.printf("Умножение: %.4f",с);
      }
      else if (znak == '/') {
          double с = a / b;
          ;
      } else {
          System.out.printf("Введен неверный знак");
      }

        }

}
