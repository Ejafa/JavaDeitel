package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int day = 1; day <= 12; day++) {
            System.out.printf("On the ");

            switch (day) {
                case 1:  System.out.printf("First"); break;
                case 2:  System.out.printf("Second"); break;
                case 3:  System.out.printf("Third"); break;
                case 4:  System.out.printf("Fourth"); break;
                case 5:  System.out.printf("Fifth"); break;
                case 6:  System.out.printf("Sixth"); break;
                case 7:  System.out.printf("Seventh"); break;
                case 8:  System.out.printf("Eighth"); break;
                case 9:  System.out.printf("Ninth"); break;
                case 10: System.out.printf("Tenth"); break;
                case 11: System.out.printf("Eleventh"); break;
                case 12: System.out.printf("Twelfth"); break;
            }

            System.out.println(" my true love sent to me:");

            for (int i = day; i >= 1; i--) {
                switch (i) {
                    case 1:  System.out.println("a Partridge in a Pear Tree"); break;
                    case 2:  System.out.println("Two Turtle Doves and "); break;
                    case 3:  System.out.println("Three French Hens,"); break;
                    case 4:  System.out.println("Four Calling Birds,"); break;
                    case 5:  System.out.println("Five Gold Rings,"); break;
                    case 6:  System.out.println("Six Geese a-Laying"); break;
                    case 7:  System.out.println("Seven Swans a-Swimming"); break;
                    case 8:  System.out.println("Eight Maids a-Milking"); break;
                    case 9:  System.out.println("Nine Ladies Dancing"); break;
                    case 10: System.out.println("Ten Lords a-Leaping"); break;
                    case 11: System.out.println("Eleven Pipers Piping"); break;
                    case 12: System.out.println("Twelve Drummers Drumming"); break;
                }

            }

            System.out.println();
        }
    }
}
