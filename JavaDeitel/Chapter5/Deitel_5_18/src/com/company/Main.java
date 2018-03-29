package com.company;

/*
5.20 (Calculating the Value of π) Calculate the value of π from the infinite series

PI = 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + ...

Print a table that shows the value of π approximated by computing the first 200,000
terms of this series. How many terms do you have to use before you first get a value
that begins with 3.14159?
*/

public class Main {

    public static void main(String[] args) {
	// write your code here
        double calculatedPI = 4;


        for (int i = 1, denominator = 3; i <= 200000; i++, denominator += 2) {
            int sign = 1;

            if (i % 2 == 1)
                sign = -1;

            calculatedPI += (sign * (4.0 / (double) denominator));
        }

        System.out.println("Calculated PI: " + calculatedPI);
    }
}
