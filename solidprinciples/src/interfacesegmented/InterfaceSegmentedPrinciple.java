package interfacesegmented;

interface RestaurantEmployee {
    void washDishes();
    void serveCustomers();
    void cookFood();
}

/*
* This class breaks Interface Segmented Principle as it implements unnecessary methods. Interface should be break in
* small segments to fix this problem
* */
class WaiterWithoutInterfaceSegment implements RestaurantEmployee {
    @Override
    public void washDishes() {
        // Not my job
    }

    @Override
    public void serveCustomers() {
        System.out.println("Serving the customer");
    }

    @Override
    public void cookFood() {
        // Not my job
    }
}

interface WaiterInterface {
    void serveCustomers();
    void takeOrder();
}

interface ChefInterface {
    void cookFood();
    void decideMenu();
}

class Waiter implements WaiterInterface {
    @Override
    public void serveCustomers() {
        System.out.println("Serving the customers");
    }

    @Override
    public void takeOrder() {
        System.out.println("taking orders");
    }
}

public class InterfaceSegmentedPrinciple {
}
