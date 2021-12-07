package com.letscode.exercicios02;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Choose a number from 1 to 10: ");
        int chosenNumber = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", chosenNumber, i, (chosenNumber * i));
        }
    }
}
