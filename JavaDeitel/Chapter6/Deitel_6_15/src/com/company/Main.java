package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner myScanner = new Scanner(System.in);
        int side1, side2;
        double hypothenuse;

        System.out.printf("Enter side 1: ");
        side1 = myScanner.nextInt();
        System.out.printf("Enter side 2: ");
        side2 = myScanner.nextInt();

        hypothenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        System.out.printf("Hypothenuse: %f", hypothenuse);
    }
}
