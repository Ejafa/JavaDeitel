package com.company;

/*  2.17 (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
    user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
    shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
    representation of the average. So, if the sum of the values is 7, the average should be 2, not
    2.3333….]
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        int number1;
        int number2;
        int number3;
        int smallest;
        int largest;

        System.out.print("Enter the first number: ");
        number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        number2 = input.nextInt();

        System.out.print("Enter the third number: ");
        number3 = input.nextInt();

        System.out.println("Sum: " + (number1 + number2 + number3));
        System.out.println("Average: " + (int)((number1 + number2 + number3) / 3));

        smallest = number1;
        if(smallest < number2) {
            smallest = number2;
        }

        if(smallest < number3) {
            smallest = number3;
        }

        System.out.println("Smallest: " + smallest);

        largest = number1;
        if (number2 > largest) {
            largest = number2;
        }

        if (number3< largest) {
            largest = number3;
        }

        System.out.println("Largest: " + largest);
    }
}
