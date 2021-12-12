package com.letscode.exercicios03;

import java.util.Scanner;

public class BiggestSmallestAverageNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Type 5 integer numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }

        showMenu(numbers);
    }

    private static void showMenu(int[] numbers) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Choose an option:%n1-Biggest number%n2-Smallest number%n3-Avarage%n");
        int menuOption = scan.nextInt();

        switch (menuOption) {
            case 1:
                showBiggestNumber(numbers);
                break;
            case 2:
                showSmallestNumber(numbers);
                break;
            case 3:
                showAverage(numbers);
                break;
            default:
                System.out.printf("Please choose a valid option!%n");
                showMenu(numbers);
        }
    }

    private static void showBiggestNumber(int[] numbers) {
        int biggestNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > biggestNumber) {
                biggestNumber = numbers[i];
            }
        }

        System.out.printf("The biggest number is %d", biggestNumber);
    }

    private static void showSmallestNumber(int[] numbers) {
        int smallestNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallestNumber) {
                smallestNumber = numbers[i];
            }
        }

        System.out.printf("The smallest number is %d", smallestNumber);
    }

    private static void showAverage(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        double average = sum / numbers.length;

        System.out.printf("The average of the numbers is %.2f", average);
    }
}
