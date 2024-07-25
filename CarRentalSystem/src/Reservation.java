import product.Vehicle;

import java.util.Date;

public class Reservation {
    int reservationId;
    User user;
    Vehicle vehicle;
    Date bookingDate;
    Date dateBookedFrom;
    Date dateBookedTo;
    Long fromTimeStamp;
    Long toTimeStamp;
    Location pickupLocation;
    Location dropLocation;
    ReservationType reservationType;
    ReservationStatus reservationStatus;
    Location location;

    public int createReserve(User user, Vehicle vehicle) {
        // Generate new id
        this.reservationId = 234234;
        this.user = user;
        this.vehicle = vehicle;
        this.reservationType = ReservationType.DAILY;
        this.reservationStatus = ReservationStatus.SCHEDULED;

        return this.reservationId;
    }

    // Reservation modify operation can be added here
}
