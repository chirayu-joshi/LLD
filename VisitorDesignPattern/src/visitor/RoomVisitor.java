package visitor;

import element.DeluxeRoom;
import element.DoubleRoom;
import element.SingleRoom;

public interface RoomVisitor {
    void visit(SingleRoom singleRoom);
    void visit(DoubleRoom doubleRoom);
    void visit(DeluxeRoom deluxeRoom);
}
