package dependencyinversion;

interface Keyboard {}

class WiredKeyboard implements Keyboard {}

class BluetoothKeyboard implements Keyboard {}

interface Mouse {}

class WiredMouse implements Mouse {}

class BluetoothMouse implements Mouse {}

/*
* This class breaks Dependency Inversion Principle because we are fixing the keyboard type as WiredKeyboard.
* But if we want to upgrade MacBook in future with a bluetooth keyboard, then it is not allowed.
*
* Instead of using a concrete class type, we should use interface.
* */
class MacBookWithoutDependencyInversion {
    private final WiredKeyboard keyboard;
    private final WiredMouse mouse;

    public MacBookWithoutDependencyInversion() {
        this.keyboard = new WiredKeyboard();
        this.mouse = new WiredMouse();
    }
}

/*
* This class is capable to accept any combination of keyboard and mouse instead of hard coding WiredKeyboard or
* WiredMouse. So it follows Dependency Inversion Principle.
* */
class MacBook {
    private final Keyboard keyboard;
    private final Mouse mouse;

    public MacBook(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}

public class DependencyInversionPrinciple {
}
