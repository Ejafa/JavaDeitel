package com.company;

/*
4.30 (Palindromes) A palindrome is a sequence of characters that reads the same backward as forward.
For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554
and 11611. Write an application that reads in a five-digit integer and determines whether it’s a palindrome.
If the number is not five digits long, display an error message and allow the user to enter
a new value.

___________________________

STEPS

GET NUMBER
CHECK FOR VALID LENGTH

CHECK IF PALINDROME
	CHECK USING ARRAY INDEXES

___________________________

*/


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int inputNumber = 0;

        while(!validInput(inputNumber)) {
            System.out.printf("Enter 5 digit palindrome: ");
            inputNumber = myScanner.nextInt();
        }

        if (isPalindrome(inputNumber))
            System.out.println("Number is a palindrome");
        else
            System.out.println("Number is not a palindrome");
    }

    private static boolean validInput(int userInput) {
        return Integer.toString(userInput).length() == 5;
    }

    private static boolean isPalindrome(int userInput) {
        String inputNumberToString = Integer.toString(userInput);
        if (inputNumberToString.charAt(0) == inputNumberToString.charAt(4)) {
            if (inputNumberToString.charAt(1) == inputNumberToString.charAt(3)) {
                return true;
            }
        }
        return false;
    }
}
