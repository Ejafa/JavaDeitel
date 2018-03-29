package com.company;

import java.util.Scanner;

public class Main {
    public static int calculateFactorial(int n) {
        int result = 1;

        for(int i = n; i > 1; i--) {
            result = result * i;
        }

        return result;
    }

    public static double calculateE(int n) {
        double result = 1.0;

        for (int i = 1; i <= n; i++) {
            result += ( 1.0 / calculateFactorial(i));
        }

        return result;
    }

    public static double calculateEExponent(int e_exponent, int n) {
        double result = 1.0;

        for (int i = 1; i <= n; i++) {
            result += ( Math.pow((double) e_exponent, (double) i) / calculateFactorial(i) );
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int inputNumber = myScanner.nextInt();
        //Write an application that reads a nonnegative integer and computes and prints its factorial.
        System.out.println("Factorial: " + calculateFactorial(inputNumber));
        inputNumber = myScanner.nextInt();
        System.out.println("Factorial: " + calculateE(inputNumber));
        int exponent = myScanner.nextInt();
        inputNumber = myScanner.nextInt();
        System.out.println("e^x = " + calculateEExponent(exponent, inputNumber));
    }
}
