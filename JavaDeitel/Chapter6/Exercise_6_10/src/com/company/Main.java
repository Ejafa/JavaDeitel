package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double doubleNumber;
        Scanner myScanner = new Scanner(System.in);

        System.out.printf("Enter positive double number: ");
        doubleNumber = myScanner.nextDouble();

        while (doubleNumber > -1) {
            System.out.printf("Number: %f\n", doubleNumber);
            System.out.printf("Rounded Number: %f\n", roundToInteger(doubleNumber));
            System.out.printf("Rounded Number (Tenths): %f\n", roundToTenths(doubleNumber));
            System.out.printf("Rounded Number (Hundreths): %f\n", roundToHundreths(doubleNumber));
            System.out.printf("Rounded Number (Thousanths): %f\n", roundToThousandths(doubleNumber));
            System.out.printf("Enter double number (-1 to finish): ");
            doubleNumber = myScanner.nextDouble();
        }
    }

    public static double roundToInteger(double inputNumber) {
        return Math.floor(inputNumber + 0.5);
    }

    public static double roundToTenths(double inputNumber) {
        return Math.floor(inputNumber * 10 + 0.5) / 10;
    }

    public static double roundToHundreths(double inputNumber) {
        return Math.floor(inputNumber * 100 + 0.5) / 100;
    }

    public static double roundToThousandths(double inputNumber) {
        return Math.floor(inputNumber * 1000 + 0.5) / 1000;
    }
}
