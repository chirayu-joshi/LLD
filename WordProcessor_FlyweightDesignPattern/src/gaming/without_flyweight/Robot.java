package gaming.without_flyweight;

// Around 31KB
public class Robot {
    int coordinateX;    // 4B
    int coordinateY;    // 4B
    String type;        // Around 50B
    Sprites body;   // Small 2d bitmap // Around 30KB

    public Robot(int coordinateX, int coordinateY, String type, Sprites body) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.type = type;
        this.body = body;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Sprites getBody() {
        return body;
    }

    public void setBody(Sprites body) {
        this.body = body;
    }
}
