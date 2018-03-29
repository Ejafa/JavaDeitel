package com.company;
import java.util.Scanner;

/*
4.36 (Sides of a Right Triangle) Write an application that reads three nonzero integers and determines
     and prints whether they could represent the sides of a right triangle.
*/

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Enter the three sides: ");
        int side1 = myScanner.nextInt();
        int side2 = myScanner.nextInt();
        int side3 = myScanner.nextInt();

        int side1_sq = side1 * side1;
        int side2_sq = side2 * side2;
        int side3_sq = side3 * side3;

        if (  ( side1_sq == side2_sq + side3_sq ) ||
              ( side2_sq == side1_sq + side3_sq )||
              ( side3_sq == side1_sq + side2_sq )) {
            System.out.println("These are the sides of a right triangle");
        } else {
            System.out.println("These are not the sides of a right triangle");
        }
    }
}
