package with_bridge;

import with_bridge.abstraction.Dog;
import with_bridge.abstraction.LivingThings;
import with_bridge.abstraction.Tree;
import with_bridge.implementor.LandBreatheImplementation;
import with_bridge.implementor.TreeBreatheImplementation;

public class Main {
    public static void main(String[] args) {
        LivingThings dog = new Dog(new LandBreatheImplementation());
        dog.breatheProcess();

        LivingThings tree = new Tree(new TreeBreatheImplementation());
        tree.breatheProcess();
    }
}
