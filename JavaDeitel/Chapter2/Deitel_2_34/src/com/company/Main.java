package com.company;

/*
2.34 (World Population Growth Calculator) Use the web to determine the current world population
        and the annual world population growth rate. Write an application that inputs these values,
        then displays the estimated world population after one, two, three, four and five years.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        long currentPopulation;
        long estimatedPopulation;

        double growthRate;

        System.out.printf("Enter current population: ");
        currentPopulation = myScanner.nextLong();

        System.out.printf("Enter growth rate: ");
        growthRate = myScanner.nextDouble();
        growthRate = (growthRate / 100) + 1;

        estimatedPopulation = (long)(currentPopulation * growthRate);
        System.out.printf("Estimated World Population after 1 year: %d\n", estimatedPopulation);
        estimatedPopulation = (long) (estimatedPopulation * growthRate);
        System.out.printf("Estimated World Population after 2 years: %d\n", estimatedPopulation);
        estimatedPopulation = (long) (estimatedPopulation * growthRate);
        System.out.printf("Estimated World Population after 3 years: %d\n", estimatedPopulation);
        estimatedPopulation = (long) (estimatedPopulation * growthRate);
        System.out.printf("Estimated World Population after 4 years: %d\n", estimatedPopulation);
        estimatedPopulation = (long) (estimatedPopulation * growthRate);
        System.out.printf("Estimated World Population after 5 years: %d\n", estimatedPopulation);
    }
}
