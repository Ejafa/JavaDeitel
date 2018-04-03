package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner myScanner = new Scanner(System.in);
        float number1, number2, number3;

        System.out.printf("Enter number 1: ");
        number1 = myScanner.nextFloat();
        System.out.printf("Enter number 2: ");
        number2 = myScanner.nextFloat();
        System.out.printf("Enter number 3: ");
        number3 = myScanner.nextFloat();
        System.out.printf("Minimum: %f", minimum3(number1, number2, number3));
    }

    public static float minimum3(float number1, float number2, float number3) {
        return Math.min(Math.min(number1, number2), number3);
    }
}
