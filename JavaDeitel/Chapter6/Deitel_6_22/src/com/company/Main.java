package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int unitsOption;
        double temperature;

        Scanner myScanner = new Scanner(System.in);

        System.out.printf("Enter temperature: ");
        temperature = myScanner.nextDouble();
        System.out.printf("Enter target units (1 - Celsius, 2 - Fahrenheit): ");
        unitsOption = myScanner.nextInt();

        if (unitsOption == 1)
            celcius(temperature);
        else
            fahrenheit(temperature);
    }

    public static void celcius(double fahrenheit) {
        double tempInCelcius;

        tempInCelcius = 5.0 / 9.0 * ( fahrenheit - 32 );

        System.out.printf("\nTemperature in Celsius: %f", tempInCelcius);
    }

    public static void fahrenheit(double celcius) {
        double tempInFahr;

        tempInFahr = 9.0 / 5.0 * celcius + 32;

        System.out.printf("\nTemperature in Fahrenheit: %f", tempInFahr);
    }
}
