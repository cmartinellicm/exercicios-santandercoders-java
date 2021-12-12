package com.letscode.exercicios03.questao08;

import java.util.Scanner;

public class IMCCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        PersonalData[] personalDataSet = new PersonalData[5];

        System.out.println("Type 5 people personal information:");

        for (int i = 0; i < personalDataSet.length; i++) {
            personalDataSet[i] = new PersonalData();

            System.out.printf("%nPerson #%d%n", i + 1);

            System.out.print("Name: ");
            personalDataSet[i].setName(scan.next());

            System.out.print("Height (m): ");
            personalDataSet[i].setHeight(scan.nextDouble());

            System.out.print("Weight (kg): ");
            personalDataSet[i].setWeight(scan.nextDouble());

            personalDataSet[i].setImc(calculateIMC(personalDataSet[i]));
        }

        checkPeopleOutOfIdealIMC(personalDataSet);

    }

    private static double calculateIMC(PersonalData personalData) {
        double weight = personalData.getWeight();
        double height = personalData.getHeight();

        double imc = weight / (height * height);

        return imc;
    }

    private static void checkPeopleOutOfIdealIMC(PersonalData[] personalDataSet) {
        for (int i = 0; i < personalDataSet.length; i++) {
            double imc = personalDataSet[i].getImc();

            if (imc < 18.5 || imc > 25) {
                System.out.printf("%s is out of ideal weight.%n", personalDataSet[i].getName());
            }
        }
    }
}
