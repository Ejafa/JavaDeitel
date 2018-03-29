package com.company;
/*
2.32 (Negative, Positive and Zero Values) Write a program that inputs five numbers and determines
        and prints the number of negative numbers input, the number of positive numbers input and
        the number of zeros input.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int inputInt1;
        int positiveCount, negativeCount, zeroCount;

        positiveCount = 0;
        negativeCount = 0;
        zeroCount = 0;

        System.out.printf("Enter 5 integers: ");

        inputInt1 = myScanner.nextInt();

        if (inputInt1 == 0) {
            zeroCount++;
        } else if (inputInt1 > 0) {
            positiveCount++;
        } else {
            negativeCount++;
        }

        inputInt1 = myScanner.nextInt();

        if (inputInt1 == 0) {
            zeroCount++;
        } else if (inputInt1 > 0) {
            positiveCount++;
        } else {
            negativeCount++;
        }

        inputInt1 = myScanner.nextInt();

        if (inputInt1 == 0) {
            zeroCount++;
        } else if (inputInt1 > 0) {
            positiveCount++;
        } else {
            negativeCount++;
        }

        inputInt1 = myScanner.nextInt();

        if (inputInt1 == 0) {
            zeroCount++;
        } else if (inputInt1 > 0) {
            positiveCount++;
        } else {
            negativeCount++;
        }

        inputInt1 = myScanner.nextInt();

        if (inputInt1 == 0) {
            zeroCount++;
        } else if (inputInt1 > 0) {
            positiveCount++;
        } else {
            negativeCount++;
        }

        System.out.println("Count of Zeros: " + zeroCount);
        System.out.println("Count of Positives: " + positiveCount);
        System.out.println("Count of Negatives: " + negativeCount);
    }
}
