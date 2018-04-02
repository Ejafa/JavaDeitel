package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int inputNumber1, inputNumber2;

        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Enter number 1: ");
        inputNumber1 = myScanner.nextInt();
        System.out.printf("Enter number 2: ");
        inputNumber2 = myScanner.nextInt();
        System.out.println("Multiples: " + isMultiple(inputNumber1, inputNumber2));
    }

    public static boolean isMultiple(int number1, int number2) {
        return (number1 % number2 == 0);
    }
}
