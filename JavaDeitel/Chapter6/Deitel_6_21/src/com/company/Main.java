package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        displayDigits(123);
    }

    public static int getQuotient(int integerA, int integerB) {
        return integerA / integerB;
    }

    public static int getRemainder(int integerA, int integerB) {
        return integerA % integerB;
    }

    public static void displayDigits(int integerA) {
        int digit;
        boolean leftzeroes = true;

        for (int i = 10000; i >= 1; i /= 10) {
            digit = getQuotient(integerA, i);

            if (digit != 0 || !leftzeroes) {
                System.out.printf("  %d", digit);
                leftzeroes = false;
            }

            integerA = getRemainder(integerA, i);
        }
    }
}
