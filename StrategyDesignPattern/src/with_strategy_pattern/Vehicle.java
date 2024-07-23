package with_strategy_pattern;

import with_strategy_pattern.strategy.DriveStrategy;
import with_strategy_pattern.strategy.NormalDriveStrategy;

public class Vehicle {
    private final DriveStrategy driveStrategy;

    public Vehicle() {
        this.driveStrategy = new NormalDriveStrategy();
    }

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
