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
(i.e., multiplies the quantity by the price per item),
then returns the amount as a double value.
If the quantity is not positive, it should be set to 0.
If the price per item is not positive, it should be set to 0.0.
*/

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantityOfPurchase;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantityOfPurchase, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantityOfPurchase = quantityOfPurchase;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantityOfPurchase() {
        return quantityOfPurchase;
    }

    public void setQuantityOfPurchase(int quantityOfPurchase) {
        this.quantityOfPurchase = quantityOfPurchase;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount() {
        if (quantityOfPurchase < 0) {
            return 0;
        }

        if (pricePerItem < 0) {
            return 0;
        }

        return quantityOfPurchase * pricePerItem;
    }
}
