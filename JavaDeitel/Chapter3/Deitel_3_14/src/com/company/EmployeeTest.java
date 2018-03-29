package com.company;
/*
3.14 (Employee Class) Create a class called Employee that includes three instance variables—a first
name (type String), a last name (type String) and a monthly salary (double). Provide a constructor
that initializes the three instance variables. Provide a set and a get method for each instance variable. If
the monthly salary is not positive, do not set its value. Write a test application named EmployeeTest
that demonstrates class Employee’s capabilities. Create two Employee objects and display each object’s
yearly salary. Then give each Employee a 10% raise and display each Employee’s yearly salary again.

employee class
instance variables:
a first name (type String),
a last name (type String) and
a monthly salary (double)

Constructor initializes the three instance variables.
Provide get and set methods.

If the monthly salary is not positive, do not set its value.

Write a test application named EmployeeTest that demonstrates class Employee’s capabilities.
Create two Employee objects and display each object’s yearly salary.
Then give each Employee a 10% raise and display each Employee’s yearly salary again.

*/

public class EmployeeTest {

    public static void main(String[] args) {
	    Employee employee_1 = new Employee("Marco", "Ramirez", 10000);
	    Employee employee_2 = new Employee("Juan", "Perez", 8000);

        System.out.println("Employee 1 yearly salary: " + (12 * employee_1.getMonthlySalary()));
        System.out.println("Employee 2 yearly salary: " + (12 * employee_2.getMonthlySalary()));

        employee_1.setMonthlySalary(employee_1.getMonthlySalary() * 1.1);
        employee_2.setMonthlySalary(employee_2.getMonthlySalary() * 1.1);

        System.out.println("Employee 1 yearly salary: " + (12 * employee_1.getMonthlySalary()));
        System.out.println("Employee 2 yearly salary: " + (12 * employee_2.getMonthlySalary()));
    }
}
