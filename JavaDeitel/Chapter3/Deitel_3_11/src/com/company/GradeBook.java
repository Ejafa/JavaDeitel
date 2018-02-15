package com.company;

// Fig. 3.10: GradeBook.java
 // GradeBook class with a constructor to initialize the course name.

public class GradeBook
{
    private String courseName; // course name for this GradeBook
    private String courseInstructor;

    public String getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(String courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

    public GradeBook(String courseName, String courseInstructor) {
        this.courseName = courseName;
        this.courseInstructor = courseInstructor;
    }

    // method to retrieve the course name
    public String getCourseName()
    {
        return courseName;
    } // end method getCourseName

    public void setCourseName( String name )
    {
        courseName = name; // store the course name
    } // end method setCourseName

    // display a welcome message to the GradeBook user
    public void displayMessage()
    {
         // this statement calls getCourseName to get the
         // name of the course this GradeBook represents
         System.out.printf( "Welcome to the grade book for\n%s!\n",
         getCourseName() );
         System.out.printf( "This course is presented by %s", getCourseInstructor());
    } // end method displayMessage
} // end class GradeBook
