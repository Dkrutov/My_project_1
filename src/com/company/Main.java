package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        String text= scanner.next();
        System.out.println("Integer:" + i);
        System.out.println("String:" + text);
        System.err.println("This is error stream");
        scanner.close();
    }
}
