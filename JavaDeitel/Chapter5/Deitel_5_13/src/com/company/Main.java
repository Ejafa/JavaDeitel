package com.company;

/*
5.13 (Factorials) Factorials are used frequently in probability problems.
The factorial of a positive integer n (written n! and pronounced “n factorial”)
is equal to the product of the positive integers from 1 to n. Write an application
that calculates the factorials of 1 through 20. Use type long. Display the
results in tabular format. What difficulty might prevent you from calculating
the factorial of 100?
*/

public class Main {
    public static int factorial(int input) {
        int accumulator = 1;

        for (int i = input; i > 1; i--) {
            accumulator *= i;
        }

        return accumulator;
    }

    public static void main(String[] args) {
	// write your code here
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%5d%20d\n", i, factorial(i));
        }
    }
}
