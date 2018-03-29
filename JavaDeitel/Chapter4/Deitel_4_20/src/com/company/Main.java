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


public class Main {

    public static void main(String[] args) {
	    Employee employee_1 = new Employee(2.5, "Marco");
	    Employee employee_2 = new Employee(3.5, "Romina");
	    Employee employee_3 = new Employee(4.5, "Gema");

	    employee_1.setHoursWorked(40);
	    employee_2.setHoursWorked(45);
	    employee_3.setHoursWorked(50);

	    employee_1.displayGrossPay();
	    employee_2.displayGrossPay();
	    employee_3.displayGrossPay();
    }
}
