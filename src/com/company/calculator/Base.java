package com.company.calculator;

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Сalculation calc = new Сalculation();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое значение: ");
        calc.setOperand1(scanner.nextDouble());
        System.out.println("Введите второе значение: ");
        calc.setOperand2(scanner.nextDouble());
        System.out.println("Выберите тип операции с числами: '+', '-', '*', '/'");
        char znak = scanner.next().charAt(0);
        System.out.println("Тип операции с числами: " + znak);
        if (znak == '+') {
            System.out.printf("Сложение: %.4f",calc.Addition());
        }
        else if (znak == '-') {
            System.out.printf("Вычитание: %.4f",calc.Subtraction());
        }
        else if (znak == '*') {
            System.out.printf("Умножение: %.4f",calc.Multiplication());
        }
        else if (znak == '/') {
            System.out.printf("Деление: %.4f",calc.Division());
        } else {
            System.out.printf("Введен неверный знак");
        }

    }

}
