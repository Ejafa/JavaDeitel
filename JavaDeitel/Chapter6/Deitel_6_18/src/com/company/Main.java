package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        squareOfAstherisks(10);
    }

    public static void squareOfAstherisks(int side) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
