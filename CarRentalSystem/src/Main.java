import product.Car;
import product.Vehicle;
import product.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = addUsers();
        List<Vehicle> vehicles = addVehicles();
        List<Store> stores = addStores(vehicles);

        VehicleRentalSystem rentalSystem = new VehicleRentalSystem(users, stores);

        // User comes
        User user = users.get(0);

        // User search store based on location
        Location location = new Location("India", "Bangalore", "Karnataka", 123456);
        Store store = rentalSystem.getStore(location);

        // Get all vehicles that you are interested in based upon different filters
        List<Vehicle> storeVehicles = store.getVehicles(VehicleType.CAR);

        // Reserving the particular vehicle
        Reservation reservation = store.createReservation(storeVehicles.get(0), users.get(0));

        // Generate the bill
        Bill bill = new Bill(reservation);

        // Make payment
        Payment payment = new Payment();
        payment.payBill(bill);

        // Trip completed, submit the vehicle and close the reservation
        store.completeReservation(reservation.reservationId);
    }

    private static List<User> addUsers() {
        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setUserId(1);

        users.add(user1);
        return users;
    }

    private static List<Vehicle> addVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();

        Vehicle vehicle1 = new Car();
        vehicle1.setVehicleID(1);

        Vehicle vehicle2 = new Car();
        vehicle2.setVehicleID(2);

        vehicles.add(vehicle1);
        vehicles.add(vehicle2);

        return vehicles;
    }

    private static List<Store> addStores(List<Vehicle> vehicles) {
        List<Store> stores = new ArrayList<>();
        Store store1 = new Store();
        store1.storeId = 1;
        store1.setVehicles(vehicles);

        stores.add(store1);
        return stores;
    }
}