package singleresponsibility;

class Marker {
    String name;
    String color;
    int year;
    int price;

    public Marker(String name, String color, int year, int price) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.price = price;
    }
}

/*
* This class doesn't follow Single Responsibility Principle because it is doing multiple things
* It is calculating total, printing invoice, saving to DB
*
* Let's say you want to introduce GST, or printing logic changes or you want to save data into files
* instead of DB, then singleresponsibility.Invoice class will change
*
* To fix this issue, printInvoice() and saveToDB() will be moved to their own classes
* */
class InvoiceWithoutSingleResponsibility {
    private Marker marker;
    private int quantity;

    public InvoiceWithoutSingleResponsibility(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal() {
        return marker.price * quantity;
    }

    public void printInvoice() {}

    public void saveToDB() {}
}

class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculate() {
        return this.marker.price * this.quantity;
    }
}

class InvoiceDao {
    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {}
}

class InvoicePrinter {
    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void print() {}
}

public class SingleResponsibilityPrinciple {
}
