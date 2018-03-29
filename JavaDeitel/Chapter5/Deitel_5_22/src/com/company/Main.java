package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //System.out.println("(a)");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-15c", ' ');
            for (int j = 0; j <= i; j++)
                System.out.print('*');

            for (int j = i; j < 15; j++)
                System.out.print(' ');

            for (int j = 0; j < 10 - i; j++)
                System.out.print('*');

            for (int j = 0; j < 5 + 2* i; j++)
                System.out.print(' ');

            for (int j = 0; j < 10 - i; j++)
                System.out.print('*');

            for (int j = 0; j < 15 - i; j++ )
                System.out.print( ' ' );

            for (int j = 0; j <= i; j++)
                System.out.print('*');

            System.out.println();
        }
    }
}
