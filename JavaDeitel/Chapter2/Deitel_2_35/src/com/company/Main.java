package com.company;
/*
2.35 (Car-Pool Savings Calculator) Research several car-pooling websites. Create an application
        that calculates your daily driving cost, so that you can estimate how much money could be saved by
        car pooling, which also has other advantages such as reducing carbon emissions and reducing traffic
        congestion. The application should input the following information and display the user’s cost per
        day of driving to work:
        a) Total miles driven per day.
        b) Cost per gallon of gasoline.
        c) Average miles per gallon.
        d) Parking fees per day.
        e) Tolls per day.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        double totalMilesDrivenPerDay;
        double costPerGallonOfGasoline;
        double averageMilesPerGallon;
        double parkingFeesPerDay;
        double tollsPerDay;
        double totalCostOfDriving;

        System.out.println("=== DAILY DRIVING COST CALCULATOR ===");
        System.out.printf("Enter total miles driven per day: ");
        totalMilesDrivenPerDay = myScanner.nextDouble();

        System.out.printf("Enter cost per gallon of gasoline: ");
        costPerGallonOfGasoline = myScanner.nextDouble();

        System.out.printf("Enter average miles per gallon: ");
        averageMilesPerGallon = myScanner.nextDouble();

        System.out.printf("Enter parking fees per day: ");
        parkingFeesPerDay = myScanner.nextDouble();

        System.out.printf("Enter tolls per day: ");
        tollsPerDay = myScanner.nextDouble();

        totalCostOfDriving = (costPerGallonOfGasoline * (totalMilesDrivenPerDay / averageMilesPerGallon))
                + parkingFeesPerDay + tollsPerDay;

        System.out.printf("Total cost of driving: %f", totalCostOfDriving);
    }
}
