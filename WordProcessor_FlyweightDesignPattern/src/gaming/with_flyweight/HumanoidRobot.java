package gaming.with_flyweight;

public class HumanoidRobot implements RobotInterface {
    private String type;
    private Sprites body;

    public HumanoidRobot(String type, Sprites body) {
        this.type = type;
        this.body = body;
    }

    public String getType() {
        return this.type;
    }

    public Sprites getBody() {
        return this.body;
    }

    @Override
    public void display(int x, int y) {
        // Use humanoid sprites object and (x,y) coordinates to render the image
        System.out.println("Displaying " + this.type + " at (" + x + ", " + y + ")");
    }
}
