package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double radius;

        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Enter radius of a circle: ");
        radius = myScanner.nextDouble();

        System.out.printf("Area: %f", circleArea(radius));
    }

    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
