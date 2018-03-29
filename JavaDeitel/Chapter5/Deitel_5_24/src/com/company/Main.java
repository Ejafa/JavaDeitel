package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++)
                System.out.print(' ');

            for (int j = 0; j < 1 + 2*i; j++)
                System.out.print('*');

            System.out.println();
        }

        for (int i = 3; i >= 0; i--) {
            for (int j = 0; j <= 3 - i; j++)
                System.out.print(' ');

            for (int j = 0; j < 1 + 2*i; j++)
                System.out.print('*');

            System.out.println();
        }

    }
}
