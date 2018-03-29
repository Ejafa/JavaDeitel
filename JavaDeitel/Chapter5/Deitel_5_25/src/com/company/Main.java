package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int rows = myScanner.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - 1 - i; j++)
                System.out.print(' ');

            for (int j = 0; j < 1 + 2*i; j++)
                System.out.print('*');

            System.out.println();
        }

        for (int i = rows - 2; i >= 0; i--) {
            for (int j = 0; j <= rows - 2 - i; j++)
                System.out.print(' ');

            for (int j = 0; j < 1 + 2*i; j++)
                System.out.print('*');

            System.out.println();
        }

    }
}
