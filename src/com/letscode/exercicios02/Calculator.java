package com.letscode.exercicios02;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Select an operation: 1-Sum 2-Subtraction 3-Multiplication 4-Division");
        int operation = scan.nextInt();

        System.out.print("Type first number: ");
        int firstNumber = scan.nextInt();

        System.out.print("Type second number: ");
        int secondNumber = scan.nextInt();

        switch (operation) {
            case 1:
                System.out.printf("Result = %d", sum(firstNumber, secondNumber));
                break;
            case 2:
                System.out.println("Subtraction");
                break;
            case 3:
                System.out.println("Multiplication");
                break;
            case 4:
                System.out.println("Division");
                break;
            default:
                System.out.println("Invalid operation!");
                break;
        }
    }

    public static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
