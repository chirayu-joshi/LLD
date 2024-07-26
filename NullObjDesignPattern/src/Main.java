public class Main {
    public static void main(String[] args) {
        Vehicle bike = VehicleFactory.vehicleOf("Bike");
        printVehicleDetails(bike);
    }

    private static void printVehicleDetails(Vehicle vehicle) {
        System.out.println("Seat Capacity: " + vehicle.getSeatCount());
        System.out.println("Fuel Capacity: " + vehicle.getTankCapacity());
    }
}