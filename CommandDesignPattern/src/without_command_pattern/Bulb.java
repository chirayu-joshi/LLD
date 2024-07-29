package without_command_pattern;

public class Bulb {
    boolean isOn;

    public void turnOnBulb() {
        this.isOn = true;
        System.out.println("Bulb is ON");
    }

    public void turnOffBulb() {
        this.isOn = false;
        System.out.println("Bulb is OFF");
    }
}
