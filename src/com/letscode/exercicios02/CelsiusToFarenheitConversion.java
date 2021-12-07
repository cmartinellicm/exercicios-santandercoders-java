package com.letscode.exercicios02;

import java.util.Scanner;

public class CelsiusToFarenheitConversion {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Type temperature in Celcius: ");
        float chosenTemperature = scan.nextFloat();

        System.out.printf("That is equivalent to %.2f F", convertToFarenheit(chosenTemperature));
    }

    public static float convertToFarenheit(float temperatureInCelcius) {
        return (temperatureInCelcius * 9/5) + 32;
    }
}
