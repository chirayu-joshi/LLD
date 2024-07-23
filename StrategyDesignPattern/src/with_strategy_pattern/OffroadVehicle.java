package with_strategy_pattern;

import with_strategy_pattern.strategy.SportsDriveStrategy;

public class OffroadVehicle extends Vehicle {
    public OffroadVehicle() {
        super(new SportsDriveStrategy());
    }
}
