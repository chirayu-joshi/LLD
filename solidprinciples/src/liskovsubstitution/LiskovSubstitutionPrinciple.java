package liskovsubstitution;

interface BikeWithoutLiskovSubstitution {
    void turnOnEngine();
    void accelerate();
}

class MotorCycleWithoutLiskovSubstitution implements BikeWithoutLiskovSubstitution {
    boolean isEngineOn;
    int speed;

    @Override
    public void turnOnEngine() {
        this.isEngineOn = true;
    }

    @Override
    public void accelerate() {
        this.speed *= 2;
    }
}

/*
* This class violates Liskov Substitution Principle as turnOnEngine() is
* breaking the behaviour of the program.
* */
class BicycleWithoutLiskovSubstitution implements BikeWithoutLiskovSubstitution {
    int speed;

    @Override
    public void turnOnEngine() {
        throw new AssertionError("There is no engine");
    }

    @Override
    public void accelerate() {
        this.speed *= 2;
    }
}

interface Bike {
    void accelerate();
}

interface EngineBike extends Bike {
    void turnOnEngine();
}

class MotorCycle implements EngineBike {
    boolean isEngineOn;
    int speed;

    @Override
    public void turnOnEngine() {
        this.isEngineOn = true;
    }

    @Override
    public void accelerate() {
        this.speed *= 2;
    }
}

class BicycleBike implements Bike {
    int speed;

    @Override
    public void accelerate() {
        this.speed *= 2;
    }
}

public class LiskovSubstitutionPrinciple {
}
