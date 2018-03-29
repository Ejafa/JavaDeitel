package com.company;

/*
4.29 (Square of Asterisks) Write an application that prompts the user to enter the size of the side
of a square, then displays a hollow square of that size made of asterisks. Your program should work
for squares of all side lengths between 1 and 20.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int sideSize;

        System.out.printf("Enter the size of the side of a square: ");
        sideSize = myScanner.nextInt();

        if (sideSize >= 1 && sideSize <= 20) {
            for(int i = 0; i < sideSize; i++) {
                for (int j = 0; j < sideSize; j++) {
                    System.out.printf("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid input");
        }

    }
}
