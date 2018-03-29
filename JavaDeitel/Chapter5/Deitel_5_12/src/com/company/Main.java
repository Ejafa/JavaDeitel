package com.company;

/*
5.12 (Calculating the Product of Odd Integers)
        Write an application that calculates the product
        of the odd integers from 1 to 15.
*/

public class Main {

    public static void main(String[] args) {
	// write your code here
        int multAccumulator = 1;

        for (int i = 1; i <= 15; i += 2) {
            multAccumulator *= i;
        }

        System.out.println("Result: " + multAccumulator);
    }
}
