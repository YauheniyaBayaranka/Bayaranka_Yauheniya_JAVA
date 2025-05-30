package org.example;

import java.util.Scanner;

//Необходимо выполнить с использованием языка программирования Java (11 версия).
//1. Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
//- сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
//- совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.

public class Task_2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число (a): ");
        int a = scanner.nextInt();

        System.out.print("Введите второе целое число (b): ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        int sum = a + b;
        int subtraction = a - b;
        int multiplication = a * b;

        System.out.println(" (a + b): " + sum);
        System.out.println(" (a - b): " + subtraction);
        System.out.println(" (a * b): " + multiplication);

        if (b != 0) {
            double division = (double) a / b;
            System.out.println("Деление (a / b): " + division);
        } else {
            System.out.println("Выполнить действие  невозможно: нельзя делить на ноль.");
        }

        scanner.close();
    }
}