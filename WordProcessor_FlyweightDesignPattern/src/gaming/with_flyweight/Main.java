package gaming.with_flyweight;

public class Main {
    public static void main(String[] args) {
        RobotInterface humanoidRobot1 = RoboticFactory.createRobot("HUMANOID");
        humanoidRobot1.display(1, 2);

        RobotInterface humanoidRobot2 = RoboticFactory.createRobot("HUMANOID");
        humanoidRobot2.display(10, 30);

        RobotInterface roboDog1 = RoboticFactory.createRobot("ROBOTIC_DOG");
        roboDog1.display(2, 9);

        RobotInterface roboDog2 = RoboticFactory.createRobot("ROBOTIC_DOG");
        roboDog2.display(11, 19);
    }
}
