package com.company;

/*2.26 (Multiples) Write an application that reads two integers, determines whether the first is a
multiple of the second and prints the result. [Hint: Use the remainder operator.] */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int inputVariable_1, inputVariable_2;

        System.out.print("Enter first integer: ");
        inputVariable_1 = myScanner.nextInt();
        myScanner.nextLine();

        System.out.print("Enter second integer: ");
        inputVariable_2 = myScanner.nextInt();
        myScanner.nextLine();

        if(inputVariable_1 % inputVariable_2 == 0) {
            System.out.println("First number is multiple of the second");
        }

        if (inputVariable_1 % inputVariable_2 != 0) {
            System.out.println("First number is not a multiple of the second");
        }
    }
}
