package com.letscode.exercicios03;

import java.util.Scanner;

public class fruitsArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] fruits = new String[5];

        System.out.println("You can add 5 fruits to your shopping cart. Choose wisely!");

        for (int i = 0; i < fruits.length; i++) {
            System.out.printf("Fruit #%d: ", i + 1);
            fruits[i] = scan.nextLine();
        }

        showShoppingCart(fruits);
    }

    private static void showShoppingCart(String[] fruits) {
        System.out.printf("%nItems in your shopping cart:%n");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }
    }
}
