package com.company;

/*
4.20 (Salary Calculator) Develop a Java application that determines the gross pay for each of
three employees. The company pays straight time for the first 40 hours worked by each employee
and time and a half for all hours worked in excess of 40. You’re given a list of the employees, their
number of hours worked last week and their hourly rates. Your program should input this information
for each employee, then determine and display the employee’s gross pay. Use class Scanner to
input the data.


ANALYSIS:

CLASS:
Employee.

FIELDS:
Hours worked.
Hourly rate.

OUTPUT:
Determine and display employee's gross pay
*/

public class Employee {
    private int hoursWorked;
    private double hourlyRate;
    private String name;

    public Employee(double hourlyRate, String employeeName) {
        this.hourlyRate = hourlyRate;
        this.name = employeeName;
        this.hoursWorked = 0;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void displayGrossPay() {
        double grossPay = hourlyRate * 40;

        if (hoursWorked > 40) {
            grossPay += (1.5 * hourlyRate * (hoursWorked - 40));
        }

        System.out.printf("Gross pay for %s is: %.2f\n", this.name, grossPay);
    }
}
