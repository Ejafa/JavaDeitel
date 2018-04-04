package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Prime Numbers:");
        for (int i = 2; i <= 10000; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
        System.out.println("Is Prime? " + isPrime(4));
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt((double)number); i++) {
            if (number % i == 0)
                return false;
        }

        return true;
    }
}
