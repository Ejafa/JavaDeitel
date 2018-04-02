package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int customerHours;
        float customerCharges;
        Scanner myScanner = new Scanner(System.in);

        System.out.printf("Enter hours for costumer (-1 to finish): ");
        customerHours = Math.round(myScanner.nextFloat());


        while(customerHours != -1) {
            customerCharges = calculateCharges(customerHours);
            System.out.printf("Total charges: %f\n", customerCharges);
            System.out.printf("Enter hours for costumer: ");
            customerHours = Math.round(myScanner.nextFloat());
        }

    }

    public static float calculateCharges(int hours) {
        float charges = 0;

        if (hours <= 3) {
            charges = 2.00f;
        } else {
            charges =  2f + ((hours - 3) * 0.5f);
        }

        if (charges > 10f)
            charges = 10f;

        return charges;
    }
}
