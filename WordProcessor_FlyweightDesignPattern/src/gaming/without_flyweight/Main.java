package gaming.without_flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Robot> humanRobots = new ArrayList<>();
        List<Robot> dogRobots = new ArrayList<>();

        /*
         * Total 10 lakh objects will be created.
         * Each Robot requires around 31KB.
         * Total memory required is around 31GB
         * */

        for (int i = 0; i < 5_00_000; ++i) {
            Sprites humanoidSprite = new Sprites();
            humanRobots.add(new Robot(i, i, "HUMANOID", humanoidSprite));
        }

        for (int j = 0; j < 5_00_000; ++j) {
            Sprites roboticDogSprite = new Sprites();
            dogRobots.add(new Robot(j, j, "ROBOTIC_DOG", roboticDogSprite));
        }
    }
}