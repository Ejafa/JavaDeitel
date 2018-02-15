/*2.24 (Largest and Smallest Integers) Write an application that reads five integers and determines
and prints the largest and smallest integers in the group. Use only the programming techniques you
learned in this chapter
*/

package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int inputValue;
	    int largest, smallest;


	    System.out.print("Enter integer 1: ");
        inputValue = myScanner.nextInt();
        myScanner.nextLine();

        smallest = inputValue;
        largest = inputValue;

        System.out.print("Enter integer 2: ");
        inputValue = myScanner.nextInt();
        myScanner.nextLine();

        if(inputValue < smallest) {
            smallest = inputValue;
        }

        if(inputValue > largest) {
            largest = inputValue;
        }

        System.out.print("Enter integer 3: ");
        inputValue = myScanner.nextInt();
        myScanner.nextLine();

        if(inputValue < smallest) {
            smallest = inputValue;
        }

        if(inputValue > largest) {
            largest = inputValue;
        }

        System.out.print("Enter integer 4: ");
        inputValue = myScanner.nextInt();
        myScanner.nextLine();

        if(inputValue < smallest) {
            smallest = inputValue;
        }

        if(inputValue > largest) {
            largest = inputValue;
        }


        System.out.print("Enter integer 5: ");
        inputValue = myScanner.nextInt();
        myScanner.nextLine();

        if(inputValue < smallest) {
            smallest = inputValue;
        }

        if(inputValue > largest) {
            largest = inputValue;
        }

        System.out.println("Smallest value: " + smallest);
        System.out.println("Largest value: " + largest);
    }
}
