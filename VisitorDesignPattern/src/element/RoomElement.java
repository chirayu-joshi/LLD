package element;

import visitor.RoomVisitor;

public interface RoomElement {
    void accept(RoomVisitor visitor);
}
