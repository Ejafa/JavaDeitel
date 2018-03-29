package com.company;
/*
3.13 (Invoice Class) Create a class called Invoice that a hardware store might use to represent
an invoice for an item sold at the store. An Invoice should include four pieces of information as
instance variables—a part number (type String), a part description (type String), a quantity of the
item being purchased (type int) and a price per item (double). Your class should have a constructor
that initializes the four instance variables. Provide a set and a get method for each instance variable.
In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e.,
multiplies the quantity by the price per item), then returns the amount as a double value. If the
quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to
0.0. Write a test application named InvoiceTest that demonstrates class Invoice’s capabilities.

CLASS INVOICE
+VARS
a part number (type String),
a part description (type String),
a quantity of the item being purchased (type int) and
a price per item (double)

ADD A CONSTRUCTOR
PROVIDE SET AND GET METHODS
METHOD getInvoiceAmount calculates the invoice amount

Write a test application named InvoiceTest that demonstrates class Invoice’s capabilities.

*/

public class InvoiceTest {

    public static void main(String[] args) {
	    Invoice myInvoice_1 = new Invoice("123", "Misc 1", 2, 1.0);
	    Invoice myInvoice_2 = new Invoice("456", "Misc 2", -1, 1.5);
	    Invoice myInvoice_3 = new Invoice("789", "Misc 3", 2, -2.0);

        System.out.println("Invoice Amount 1: " + myInvoice_1.getInvoiceAmount());
        System.out.println("Invoice Amount 2: " + myInvoice_2.getInvoiceAmount());
        System.out.println("Invoice Amount 3: " + myInvoice_3.getInvoiceAmount());
    }
}
