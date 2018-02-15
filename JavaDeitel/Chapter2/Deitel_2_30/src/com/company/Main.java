package com.company;

/*
* 2.30 (Separating the Digits in an Integer) Write an application that inputs one number consisting
of five digits from the user, separates the number into its individual digits and prints the digits
separated from one another by three spaces each. For example, if the user types in the number 42339,
the program should print

4   2   3   3   9

Assume that the user enters the correct number of digits. What happens when you execute the
program and type a number with more than five digits? What happens when you execute the program
and type a number with fewer than five digits? [Hint: It’s possible to do this exercise with the
techniques you learned in this chapter. You’ll need to use both division and remainder operations
to “pick off ” each digit.]
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int inputInteger, tempVariable;

        System.out.print("Enter a five digit integer: ");
        inputInteger = myScanner.nextInt();
        myScanner.nextLine();

        System.out.printf("%d   ", inputInteger / 10000);
        tempVariable = inputInteger % 10000;

        System.out.printf("%d   ", tempVariable / 1000);
        tempVariable = tempVariable % 1000;

        System.out.printf("%d   ", tempVariable / 100);
        tempVariable = tempVariable % 100;

        System.out.printf("%d   ", tempVariable / 10);
        tempVariable = tempVariable % 10;

        System.out.printf("%d", tempVariable );
    }
}
