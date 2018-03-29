package com.company;

// Fig. 3.13: Account.java
// Account class with a constructor to validate and
// initialize instance variable balance of type double.

/*
3.12 (Modified Account Class) Modify class Account (Fig. 3.13) to provide a method called debit
that withdraws money from an Account. Ensure that the debit amount does not exceed the
Account’s balance. If it does, the balance should be left unchanged and the method should print a
message indicating "Debit amount exceeded account balance." Modify class AccountTest
(Fig. 3.14) to test method debit.
*/

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

    public void debit( double amount )
    {
        if ((balance - amount) < 0) {
            System.out.println("Debit amount exceeded account balance.");
        } else {
            balance = balance - amount;
        }
    }

    // return the account balance
    public double getBalance()
    {
        return balance; // gives the value of balance to the calling method
    } // end method getBalance

} // end class Account
