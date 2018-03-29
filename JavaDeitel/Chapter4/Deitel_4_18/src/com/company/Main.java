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

---ANALYSIS:
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

public class Main {

    public static void main(String[] args) {
        Customer customer_1 = new Customer(123, 0, 100);
        Customer customer_2 = new Customer(456, 100, 200);

        customer_1.setInitialBalance(50);
        customer_1.setTotalOfAllItemsChargedThisMonth(60);
        customer_1.setTotalOfAllCreditsAppliedThisMonth(5);

        if (customer_1.getNewBalance() > customer_1.getAllowedCreditLimit()) {
            System.out.println("Credit Limit Exceeded for Account " + customer_1.getAccountNumber());
        } else {
            System.out.println("New Balance for Account " + customer_1.getAccountNumber()
                    + " is " + customer_1.getNewBalance());
        }

        customer_2.setTotalOfAllItemsChargedThisMonth(110);
        customer_2.setTotalOfAllCreditsAppliedThisMonth(50);

        if (customer_2.getNewBalance() > customer_2.getAllowedCreditLimit()) {
            System.out.println("Credit Limit Exceeded for Account " + customer_2.getAccountNumber());
        } else {
            System.out.println("New Balance for Account " + customer_2.getAccountNumber()
                    + " is " + customer_2.getNewBalance());
        }


    }
}
