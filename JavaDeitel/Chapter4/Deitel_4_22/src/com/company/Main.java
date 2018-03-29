package com.company;

/*
4.22 (Tabular Output) Write a Java application that uses looping to print the following table of
        values:

        N   10*N    100*N   1000*N
        1   10      100     1000
        2   20      200     2000
        3   30      300     3000
        4   40      400     4000
        5   50      500     5000
*/

public class Main {

    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%-10s%-10s\n", "N", "10*N", "100*N", "1000*N");
	    for (int i = 1; i <= 5; i++) {
            System.out.printf("%-10d%-10d%-10d%-10d\n", i, 10*i, 100*i, 1000*i);
        }
    }
}
