package com.letscode.exercicios02;

import java.util.Scanner;

public class InToCmConversion {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Type value in inches to be converted: ");
        float valueInInches = scan.nextFloat();

        System.out.printf("That is equivalent to %.2f cm", convertInToCm(valueInInches));
    }

    public static float convertInToCm(float valueInInches) {
        final float CONVERSION_FACTOR = 2.54f;
        return valueInInches * CONVERSION_FACTOR;
    }
}
