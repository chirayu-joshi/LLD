package visitor;

import element.DeluxeRoom;
import element.DoubleRoom;
import element.SingleRoom;

public class RoomPricingVisitor implements RoomVisitor {
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Pricing computation logic for single room");
        singleRoom.roomPrice = 1000;
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Pricing computation logic for double room");
        doubleRoom.roomPrice = 1800;
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
        System.out.println("Pricing computation logic for deluxe room");
        deluxeRoom.roomPrice = 2500;
    }
}
