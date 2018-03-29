package com.company;

/*
4.35 (Sides of a Triangle) Write an application that reads three nonzero values entered by the
        user and determines and prints whether they could represent the sides of a triangle.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.printf("Side of triangle: ");
        int a = myScanner.nextInt();
        int b = myScanner.nextInt();
        int c = myScanner.nextInt();

        if (isItATriangle(a, b, c)) {
            System.out.println("Sides make a triangle");
        } else {
            System.out.println("Sides does not make a triangle");
        }

    }

    public static boolean isItATriangle(int side_a, int side_b, int side_c) {
        if (side_a + side_b > side_c)
            if (side_a + side_c > side_b)
                if (side_b + side_c > side_a)
                    return true;

        return false;
    }
}
