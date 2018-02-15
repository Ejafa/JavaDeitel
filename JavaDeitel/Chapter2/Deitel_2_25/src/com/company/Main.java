package com.company;

/*
* 2.25 (Odd or Even) Write an application that reads an integer and determines and prints whether
it’s odd or even. [Hint: Use the remainder operator. An even number is a multiple of 2. Any multiple
of 2 leaves a remainder of 0 when divided by 2.]
* */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int myIntValue;

        System.out.print("Enter an integer: ");
        myIntValue = myScanner.nextInt();
        myScanner.nextLine();

        if (myIntValue % 2 == 0) {
            System.out.println("Number is even");
        }

        if (myIntValue % 2 != 0) {
            System.out.println("Number is odd");
        }
    }
}
