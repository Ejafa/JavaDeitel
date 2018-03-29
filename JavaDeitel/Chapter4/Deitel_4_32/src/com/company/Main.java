package com.company;

/*
4.32 (Checkerboard Pattern of Asterisks) Write an application that uses only the output statements
System.out.print( "* " );
System.out.print( " " );
System.out.println();

to display the checkerboard pattern that follows. A System.out.println method call with no arguments
causes the program to output a single newline character. [Hint: Repetition statements are required.]

* * * * * * * *
 * * * * * * * *
* * * * * * * *
 * * * * * * * *
* * * * * * * *
 * * * * * * * *
* * * * * * * *
 * * * * * * * *
*/


public class Main {

    public static void main(String[] args) {
	    int i = 0;
        while (i < 8) {
	        if (i % 2 == 1) {
	            System.out.print( " " );
            }

            for (int j = 0; j < 8; j++) {
                System.out.print( "* " );
            }

            System.out.println();

	        i++;
        }
    }
}
