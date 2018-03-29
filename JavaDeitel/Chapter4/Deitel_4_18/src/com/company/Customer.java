package com.company;

/*
4.18 (Credit Limit Calculator) Develop a Java application that determines whether any of several
department-store customers has exceeded the credit limit on a charge account. For each customer,
the following facts are available:
   a) account number
   b) balance at the beginning of the month
   c) total of all items charged by the customer this month
   d) total of all credits applied to the customer’s account this month
   e) allowed credit limit.

The program should input all these facts as integers, calculate the new balance (= beginning balance
+ charges – credits), display the new balance and determine whether the new balance exceeds the
customer’s credit limit. For those customers whose credit limit is exceeded, the program should display
the message "Credit limit exceeded".

=====================================================================
---ANALYSIS:
=====================================================================
Department-store customers
   a) account number
   b) balance at the beginning of the month
   c) total of all items charged by the customer this month
   d) total of all credits applied to the customer’s account this month
   e) allowed credit limit.

All inputs are integers.


Calculate New Balance (= beginning balance + charges – credits)
Display new balance
Determine whether the new balance exceeds the customer's credit limit.
the program should display the message "Credit limit exceeded".
*/

public class Customer {
    private int accountNumber;
    private int initialBalance;
    private int totalOfAllItemsChargedThisMonth;
    private int totalOfAllCreditsAppliedThisMonth;
    private int allowedCreditLimit;

    public Customer(int accountNumber, int initialBalance, int allowedCreditLimit) {
        this.accountNumber = accountNumber;
        this.initialBalance = initialBalance;
        this.allowedCreditLimit = allowedCreditLimit;
        this.totalOfAllItemsChargedThisMonth = 0;
        this.totalOfAllCreditsAppliedThisMonth = 0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getNewBalance() {
        return initialBalance + totalOfAllItemsChargedThisMonth - totalOfAllCreditsAppliedThisMonth;
    }

    public int getAllowedCreditLimit() {
        return allowedCreditLimit;
    }

    public void setInitialBalance(int initialBalance) {
        this.initialBalance = initialBalance;
    }

    public void setTotalOfAllItemsChargedThisMonth(int totalOfAllItemsChargedThisMonth) {
        this.totalOfAllItemsChargedThisMonth = totalOfAllItemsChargedThisMonth;
    }

    public void setTotalOfAllCreditsAppliedThisMonth(int totalOfAllCreditsAppliedThisMonth) {
        this.totalOfAllCreditsAppliedThisMonth = totalOfAllCreditsAppliedThisMonth;
    }
}
