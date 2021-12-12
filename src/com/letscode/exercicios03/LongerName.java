package com.letscode.exercicios03;

import java.util.Scanner;

public class LongerName {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] guestList = new String[5];

        System.out.println("Type 5 guest names:");
        for (int i = 0; i < guestList.length; i++) {
            guestList[i] = scan.next();
        }

        showLongerName(guestList);
    }

    private static void showLongerName(String[] guestList) {
        String longerName = guestList[0];

        for (int i = 1; i < guestList.length; i++) {
            if (guestList[i].length() > longerName.length()) {
                longerName = guestList[i];
            }
        }

        System.out.printf("The longer name on the list is %s.", longerName);
    }
}
