package com.company;

/*
5.17 (Calculating Sales) An online retailer sells five products whose retail prices are as
        follows:

        Product 1, $2.98; product 2, $4.50; product 3, $9.98; product 4, $4.49
        and product 5, $6.87.

        Write an application that reads a series of pairs of numbers as follows:
        a) product number
        b) quantity sold

        Your program should use a switch statement to determine the retail price for each
        product. It should calculate and display the total retail value of all products sold.
        Use a sentinel-controlled loop to determine when the program should stop looping and
        display the final results.


NOTES:

reads product number,
reads quantity sold

calculate and display total retail value.
use sentinel-controlled loop


*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner myScanner = new Scanner(System.in);

        int productNumber;
        int quantitySold;
        double totalRetailValue = 0;
        double itemCost;

        productNumber = myScanner.nextInt();

        while (productNumber != -1) {
            itemCost = 0;
            quantitySold = myScanner.nextInt();
            //myScanner.nextLine();

            switch (productNumber) {
                case 1: itemCost = 2.98; break;
                case 2: itemCost = 4.50; break;
                case 3: itemCost = 9.98; break;
                case 4: itemCost = 4.49; break;
                case 5: itemCost = 6.87; break;
                default:
                    System.out.println("Item number not valid");
            }

            totalRetailValue += (quantitySold * itemCost);
            productNumber = myScanner.nextInt();
        }

        System.out.println("Total: " + totalRetailValue);
    }
}
