package com.letscode.exercicios02;

import java.util.Scanner;

public class CelsiusToFarenheitConversion {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Type temperature in Celcius: ");
        float temperatureInCelcius = scan.nextFloat();

        System.out.printf("%.2f ºC is equivalent to %.2f F", temperatureInCelcius, convertToFarenheit(temperatureInCelcius));
    }

    public static float convertToFarenheit(float temperatureInCelcius) {
        return (temperatureInCelcius * 9/5) + 32;
    }
}
