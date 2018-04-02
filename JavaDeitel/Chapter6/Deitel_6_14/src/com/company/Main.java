package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner myScanner = new Scanner(System.in);
        int inputBase;
        int inputExponent;

        System.out.printf("Enter base: ");
        inputBase = myScanner.nextInt();
        System.out.printf("Enter Exponent: ");
        inputExponent = myScanner.nextInt();
        System.out.printf("Result: %d", integerPower(inputBase, inputExponent));
    }

    public static int integerPower(int base, int exponent) {
        int result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        return result;
    }
}
