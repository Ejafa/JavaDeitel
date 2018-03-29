package com.company;
/*
4.23 (Find the Two Largest Numbers) Using an approach similar to that for Exercise 4.21, find
the two largest values of the 10 values entered. [Note: You may input each number only once.]*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int number;
        int largest = 0;
        int secondLargest = 0;

        for (int counter = 0; counter < 10; counter++) {
            number = myScanner.nextInt();

            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }
        }

        System.out.println("Largest number is: " + largest);
        System.out.println("Second largest number is: " + secondLargest);
    }
}