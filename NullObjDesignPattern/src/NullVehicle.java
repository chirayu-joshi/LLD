public class NullVehicle implements Vehicle {
    @Override
    public int getSeatCount() {
        return 0;
    }

    @Override
    public int getTankCapacity() {
        return 0;
    }
}
