package decorator;

import base.BasePizza;

public class Mushroom extends ToppingDecorator {
    private final BasePizza basePizza;

    public Mushroom(BasePizza pizza) {
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 15;
    }
}
