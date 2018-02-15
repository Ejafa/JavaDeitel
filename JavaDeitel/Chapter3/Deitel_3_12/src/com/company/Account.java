package com.company;

// Fig. 3.13: Account.java
// Account class with a constructor to validate and
// initialize instance variable balance of type double.

public class Account
{
    private double balance;

    // constructor
    public Account( double initialBalance )
    {
        // validate that initialBalance is greater than 0.0;
        // if it is not, balance is initialized to the default value 0.0
        if ( initialBalance > 0.0 )
             balance = initialBalance;
    } // end Account constructor

    // credit (add) an amount to the account
    public void credit( double amount )
    {
        balance = balance + amount; // add amount to balance
    } // end method credit

    // return the account balance
    public double getBalance()
    {
        return balance; // gives the value of balance to the calling method
    } // end method getBalance

} // end class Account
