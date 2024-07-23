package decorator;

import base.BasePizza;

public class ExtraCheese extends ToppingDecorator {
    private final BasePizza basePizza;

    public ExtraCheese(BasePizza pizza) {
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}
