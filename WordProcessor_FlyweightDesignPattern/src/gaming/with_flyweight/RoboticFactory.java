package gaming.with_flyweight;

import java.util.HashMap;
import java.util.Map;

public class RoboticFactory {
    private static final Map<String, RobotInterface> roboticObjectCache = new HashMap<>();

    public static RobotInterface createRobot(String robotType) {
        if (roboticObjectCache.containsKey(robotType)) {
            return roboticObjectCache.get(robotType);
        }
        if ("HUMANOID".equals(robotType)) {
            Sprites humanoidSprite = new Sprites();
            RobotInterface humanoidObj = new HumanoidRobot(robotType, humanoidSprite);
            roboticObjectCache.put(robotType, humanoidObj);
            return humanoidObj;
        } else if ("ROBOTIC_DOG".equals(robotType)) {
            Sprites roboticDogSprite = new Sprites();
            RobotInterface roboticDogObj = new RoboticDog(robotType, roboticDogSprite);
            roboticObjectCache.put(robotType, roboticDogObj);
            return roboticDogObj;
        }
        return null;
    }
}
