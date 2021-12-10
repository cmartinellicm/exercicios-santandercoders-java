package com.letscode.exercicios03;

import java.util.Scanner;

public class backwardsWord {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please type a word: ");
        String originalWord = scan.next();

        char[] originalWordArray = originalWord.toCharArray();
        int wordLength = originalWordArray.length;

        char[] backwardsWordArray = new char[wordLength];

        for (int i = 0; i < wordLength; i++) {
            backwardsWordArray[i] = originalWordArray[wordLength - 1 - i];
        }

        // String backwardsWord = backwardsWordArray.toString();
        for (char letter : backwardsWordArray) {
            System.out.print(letter);
        }
    }
}
