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
            doubleNumber = Math.floor(doubleNumber + 0.5);
            System.out.printf("Rounded Number: %f\n", doubleNumber);
            System.out.printf("Enter double number (-1 to finish): ");
            doubleNumber = myScanner.nextDouble();
        }
    }
}
