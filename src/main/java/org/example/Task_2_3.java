package org.example;

//3. Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9,10]
// необходимо написать программу, которая выведет в консоль все чётные числа.

public class Task_2_3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Чётные числа в массиве:");
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}