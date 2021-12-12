package com.letscode.exercicios03;

import java.util.Scanner;

public class OddUpperCase {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please type a word: ");
        String originalWord = scan.next();

        char[] originalWordArray = originalWord.toCharArray();
        convertToUpperCase(originalWordArray);
    }

    private static void convertToUpperCase(char[] originalWordArray){

        for (int i = 0; i < originalWordArray.length; i++) {
            if (i % 2 != 0) {
                char letter = Character.toUpperCase(originalWordArray[i]);
                originalWordArray[i] = letter;
            }
        }

        String formattedWord = String.valueOf(originalWordArray);
        System.out.println(formattedWord);
    };
}
