package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        squareOfAstherisks(10, '+');
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
