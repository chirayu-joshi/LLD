package openclosed;

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

class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculate() {
        return marker.price * quantity;
    }
}

/*
* Suppose that this class is tested properly and a new method saveToFile() is introduced.
*
* So instead of modifying this class, a new class with extended functionality should be introduced
* */
class InvoiceDaoWithoutOpenClosed {
    Invoice invoice;

    public InvoiceDaoWithoutOpenClosed(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {}

    // This method is to be introduced
    // public void saveToFile() {}
}

interface InvoiceDao {
    void save(Invoice invoice);
}

class DatabaseInvoiceDao implements InvoiceDao {
    @Override
    public void save(Invoice invoice) {
        // Save to DB
    }
}

class FileInvoiceDao implements InvoiceDao {
    @Override
    public void save(Invoice invoice) {
        // Save to fle
    }
}

public class OpenClosedPrinciple {
}
