package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i = 2; i <= 10000; i++)
            isPerfect(i);
    }

    public static void isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            System.out.println(number + " is a perfect number");
            System.out.printf("Factors: ");

            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    System.out.printf("%d ", i);
                }
            }

            System.out.println();
        }


    }
}
