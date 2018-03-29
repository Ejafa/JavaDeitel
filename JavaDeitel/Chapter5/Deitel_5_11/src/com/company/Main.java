package com.company;

//5.11 (Find the Smallest Value) Write an application that finds
// the smallest of several integers.
// Assume that the first value read specifies the number of values
// to input from the user.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner myScanner = new Scanner(System.in);
        int numberOfInputs = myScanner.nextInt();
        int inputNumber;
        int smallestInput = 32768;

        for (int i = 0; i < numberOfInputs; i++) {
            inputNumber = myScanner.nextInt();

            if (inputNumber < smallestInput)
                smallestInput = inputNumber;
        }

        System.out.println("Smallest input: " + smallestInput);
    }
}
