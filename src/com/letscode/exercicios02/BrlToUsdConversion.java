package com.letscode.exercicios02;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class BrlToUsdConversion {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Inform current exchange rate from Brazilian Real (BRL) to US Dollar (USD): ");
        float exchangeRate = scan.nextFloat();

        System.out.print("Value to exchange (BRL): ");
        double valueInBrl = scan.nextDouble();

        System.out.printf("%s is equivalent to %s", currencyFormat(valueInBrl, new Locale("pt", "BR")), convertRealToDollar(exchangeRate, valueInBrl));
    }

    public static String currencyFormat(double value, Locale locale) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        return nf.format(value);
    }

    public static String convertRealToDollar(float exchangeRate, double valueInBrl) {
        return currencyFormat(exchangeRate * valueInBrl, new Locale("en", "US"));
    }
}
