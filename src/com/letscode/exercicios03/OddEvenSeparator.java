package com.letscode.exercicios03;

import java.util.Scanner;

public class OddEvenSeparator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.print("Type 5 integer numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }

        System.out.printf("%nThe odd numbers are: ");

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.printf("%d ", number);
            }
        }

        System.out.printf("%nThe even numbers are: ");

        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.printf("%d ", number);
            }
        }
    }

}
