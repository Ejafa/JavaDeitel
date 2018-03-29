package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner myScanner = new Scanner(System.in);
        int inputNumber;

        for (int i = 0; i < 5; i++) {
            inputNumber = myScanner.nextInt();
            myScanner.nextLine();

            for (int j = 0; j < inputNumber; j++) {
                System.out.printf("*");
            }

            System.out.println();
        }
    }
}
