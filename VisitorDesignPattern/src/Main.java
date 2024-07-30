import element.DeluxeRoom;
import element.DoubleRoom;
import element.RoomElement;
import element.SingleRoom;
import visitor.RoomMaintenanceVisitor;
import visitor.RoomPricingVisitor;
import visitor.RoomVisitor;

public class Main {
    public static void main(String[] args) {
        SingleRoom singleRoomObj = new SingleRoom();
        DoubleRoom doubleRoomObj = new DoubleRoom();
        DeluxeRoom deluxeRoomObj = new DeluxeRoom();

        // Performing an operation on the objects
        RoomVisitor pricingVisitorObj = new RoomPricingVisitor();

        singleRoomObj.accept(pricingVisitorObj);
        System.out.println(singleRoomObj.roomPrice);

        doubleRoomObj.accept(pricingVisitorObj);
        System.out.println(doubleRoomObj.roomPrice);

        deluxeRoomObj.accept(pricingVisitorObj);
        System.out.println(deluxeRoomObj.roomPrice);

        // Performing another operation on the objects
        RoomVisitor maintenanceVisitorObj = new RoomMaintenanceVisitor();
        singleRoomObj.accept(maintenanceVisitorObj);

        doubleRoomObj.accept(maintenanceVisitorObj);

        deluxeRoomObj.accept(maintenanceVisitorObj);
    }
}
