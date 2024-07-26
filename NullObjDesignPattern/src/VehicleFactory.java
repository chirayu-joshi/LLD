public class VehicleFactory {
    public static Vehicle vehicleOf(String typeOfVehicle) {
        if ("Car".equals(typeOfVehicle)) {
            return new Car();
        }
        return new NullVehicle();
    }
}
