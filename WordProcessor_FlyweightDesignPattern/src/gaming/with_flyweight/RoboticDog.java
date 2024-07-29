package gaming.with_flyweight;

public class RoboticDog implements RobotInterface {
    private String type;
    private Sprites body;

    public RoboticDog(String type, Sprites body) {
        this.type = type;
        this.body = body;
    }

    public String getType() {
        return type;
    }

    public Sprites getBody() {
        return body;
    }

    @Override
    public void display(int x, int y) {
        // Use robotic dog sprites object and (x,y) coordinates to render the image
        System.out.println("Displaying " + this.type + " at (" + x + ", " + y + ")");
    }
}
