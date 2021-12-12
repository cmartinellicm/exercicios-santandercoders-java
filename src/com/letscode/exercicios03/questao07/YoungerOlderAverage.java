package com.letscode.exercicios03.questao07;

import java.util.Scanner;

public class YoungerOlderAverage {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Person[] people = new Person[5];

        System.out.println("Type 5 people name and age:");

        for (int i = 0; i < people.length; i++) {
            people[i] = new Person(scan.next(), scan.nextInt());
        }

        showYounger(people);
        showOlder(people);
        showAverageAge(people);
    }

    private static void showYounger(Person[] people) {
        Person youngerPerson = people[0];

        for (int i = 1; i < people.length; i++) {
            if (people[i].getAge() < youngerPerson.getAge()) {
                youngerPerson = people[i];
            }
        }

        System.out.printf("The younger person is %s.%n", youngerPerson.getName());
    };

    private static void showOlder(Person[] people) {
        Person olderPerson = people[0];

        for (int i = 1; i < people.length; i++) {
            if (people[i].getAge() > olderPerson.getAge()) {
                olderPerson = people[i];
            }
        }

        System.out.printf("The older person is %s.%n", olderPerson.getName());
    };

    private static void showAverageAge(Person[] people) {
        int sum = 0;

        for (int i = 0; i < people.length; i++) {
            sum += people[i].getAge();
        }

        double averageAge = sum / people.length;
        System.out.printf("The average age is %.2f.%n", averageAge);
    };
}
