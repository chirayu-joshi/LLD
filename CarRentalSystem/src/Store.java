import product.Vehicle;
import product.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Store {
    int storeId;
    VehicleInventoryManagement vehicleInventoryManagement;
    Location storeLocation;
    List<Reservation> reservations;

    Store() {
        reservations = new ArrayList<>();
    }

    public List<Vehicle> getVehicles(VehicleType vehicleType) {
        return vehicleInventoryManagement.getVehicles();
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicleInventoryManagement = new VehicleInventoryManagement(vehicles);
    }

    public Reservation createReservation(Vehicle vehicle, User user) {
        Reservation reservation = new Reservation();
        reservation.createReserve(user, vehicle);
        this.reservations.add(reservation);
        return reservation;
    }

    public boolean completeReservation(int reservationID) {
        // Take out reservation from the list and call complete the reservation method.
        return true;
    }
}
