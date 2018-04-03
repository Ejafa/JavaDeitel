package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int squareSize;
        char fillCharacter;

        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Enter square size: ");
        squareSize = myScanner.nextInt();
        System.out.printf("Enter fill character: ");
        fillCharacter = myScanner.next().charAt(0);

        squareOfAstherisks(squareSize, fillCharacter);
    }

    public static void squareOfAstherisks(int side, char fillCharacter) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print(fillCharacter);
            }
            System.out.println();
        }
    }
}
