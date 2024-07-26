public class Car implements Vehicle {
    @Override
    public int getSeatCount() {
        return 5;
    }

    @Override
    public int getTankCapacity() {
        return 40;
    }
}
