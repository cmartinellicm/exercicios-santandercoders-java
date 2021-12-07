package com.letscode.exercicios02;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Select an operation (1-Sum 2-Subtraction 3-Multiplication 4-Division): ");
        int operation = scan.nextInt();

        System.out.print("Type first integer number: ");
        int firstNumber = scan.nextInt();

        System.out.print("Type second integer number: ");
        int secondNumber = scan.nextInt();

        switch (operation) {
            case 1:
                System.out.printf("%d + %d = %d", firstNumber, secondNumber, sum(firstNumber, secondNumber));
                break;
            case 2:
                System.out.printf("%d - %d = %d", firstNumber, secondNumber, subtract(firstNumber, secondNumber));
                break;
            case 3:
                System.out.printf("%d x %d = %d", firstNumber, secondNumber, multiply(firstNumber, secondNumber));
                break;
            case 4:
                System.out.printf("%d / %d = %.2f", firstNumber, secondNumber, divide(firstNumber, secondNumber));
                break;
            default:
                System.out.println("Invalid operation!");
                break;
        }
    }

    public static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public static int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public static double divide(float firstNumber, float secondNumber) {
        return firstNumber / secondNumber;
    }
}
