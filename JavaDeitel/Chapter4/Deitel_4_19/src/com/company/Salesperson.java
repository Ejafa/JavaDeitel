package com.company;

/*
4.19 (Sales Commission Calculator) A large company pays its salespeople on a commission basis.
The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
salesperson who sells $5000 worth of merchandise in a week receives $200 plus 9% of $5000, or a
total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
these items are as follows:

Item    Value
1       239.99
2       129.75
3       99.95
4       350.89

Develop a Java application that inputs one salesperson’s items sold for last week and calculates and
displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.

=========================

ANALYSIS
The salespeople receive $200 per week plus 9% of their gross sales for that week

CLASS
Salesperson

INPUTS:
Items sold for last week

OUTPUTS:
Calculates and displays this person's earnings.
*/

public class Salesperson {
    private float totalSold;

    public void addItem(float itemCost) {
        totalSold += itemCost;
    }

    public void displayTotalWeekEarnings() {
        System.out.printf("TOTAL EARNINGS FOR EMPLOYEE: %.2f\n", 200.0 + .09f * totalSold);
    }
}
