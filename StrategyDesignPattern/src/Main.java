import with_strategy_pattern.PassengerVehicle;
import with_strategy_pattern.SportsVehicle;
import with_strategy_pattern.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();

        Vehicle passengerVehicle = new PassengerVehicle();
        passengerVehicle.drive();
    }
}
