package com.company;

/*3.11 (Modified GradeBook Class) Modify class GradeBook (Fig. 3.10) as follows:
a) Include a String instance variable that represents the name of the course’s instructor.
b) Provide a set method to change the instructor’s name and a get method to retrieve it.
c) Modify the constructor to specify two parameters—one for the course name and one
for the instructor’s name.
d) Modify method displayMessage to output the welcome message and course name, followed
by "This course is presented by: " and the instructor’s name.
Use your modified class in a test application that demonstrates the class’s new capabilities.*/

public class GradeBookTest {
    // main method begins program execution

    public static void main(String[] args) {
        // create GradeBook object
        GradeBook gradeBook1 = new GradeBook(
                "CS101 Introduction to Java Programming","Intructor 1" );
        GradeBook gradeBook2 = new GradeBook(
                "CS102 Data Structures in Java", "Instructor 2" );

        // display initial value of courseName for each GradeBook
        System.out.println();
        System.out.printf("gradeBook1 course name is: %s\n",
                gradeBook1.getCourseName());
        System.out.println();
        System.out.printf("gradeBook2 course name is: %s\n",
                gradeBook2.getCourseName());

        System.out.println();
        gradeBook1.displayMessage();
        System.out.println();
        gradeBook2.displayMessage();

    } // end main
} // end class GradeBookTest
