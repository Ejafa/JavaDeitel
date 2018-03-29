package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int side1 = 1; side1 <= 500; side1++ ) {
            for (int side2 = 1; side2 <= 500; side2++) {
                for (int hypothenuse = 1; hypothenuse <= 500; hypothenuse++) {
                    if (Math.pow(hypothenuse, 2) == Math.pow(side1, 2) + Math.pow(side2, 2)) {
                        System.out.println("**** RIGHT TRIANGLE *****");
                        System.out.printf("side1 = %d\n", side1);
                        System.out.printf("side2 = %d\n", side2);
                        System.out.printf("hypothenuse = %d\n", hypothenuse);
                        System.out.println("************************");
                    }
                }
            }
        }
    }
}
