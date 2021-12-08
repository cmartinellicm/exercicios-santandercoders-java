package com.letscode.exercicios02;

import java.util.Scanner;

public class BrlToUsdConversion {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Inform current exchange rate from Brazilian Real (BRL) to US Dollar (USD): ");
        float exchangeRate = scan.nextFloat();

        System.out.print("Value to exchange: R$ ");
        float valueInBrl = scan.nextFloat();

        System.out.printf("That is equivalent to US$ %.2f", convertRealToDollar(exchangeRate, valueInBrl));
    }

    public static float convertRealToDollar(float exchangeRate, float valueInBrl) {
        return exchangeRate * valueInBrl;
    }
}
