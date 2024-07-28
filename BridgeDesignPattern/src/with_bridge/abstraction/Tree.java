package with_bridge.abstraction;

import with_bridge.implementor.BreatheImplementor;

public class Tree extends LivingThings {
    public Tree(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        breatheImplementor.breathe();
    }
}
